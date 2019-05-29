package main

import (
	"flag"
	"fmt"
	"io/ioutil"
	"log"
	"os"

	"github.com/mkorolyov/astparser"
	"github.com/mkorolyov/genkotlin/kotlin"
)

var (
	inputDir         = flag.String("in", "", "directory with go files to be parsed")
	excludeRegexpStr = flag.String("e", "", "exclude regexp to skip files")
	includeRegexpStr = flag.String("i", "", "include regexp to limit input files")
	outputDir        = flag.String("o", "", "output directory for generated files")
)

func main() {
	flag.Parse()

	// load golang sources
	cfg := astparser.Config{InputDir: *inputDir}
	if *excludeRegexpStr != "" {
		cfg.ExcludeRegexp = *excludeRegexpStr
	}
	if *includeRegexpStr != "" {
		cfg.IncludeRegexp = *includeRegexpStr
	}
	sources, err := astparser.Load(cfg)
	if err != nil {
		log.Fatalf("failed to load sources from %s excluding %s: %v", *inputDir, *excludeRegexpStr, err)
	}

	// generate kotlin classes
	if *outputDir != "" {
		kotlinFiles := kotlin.Generate(sources)
		// save
		for f, body := range kotlinFiles {
			filePath := *outputDir + "/" + f + ".kt"
			if err := ioutil.WriteFile(filePath, body, 0666); err != nil {
				fmt.Fprintf(os.Stderr, "failed to save generated kotlin file %s: %v", filePath, err)
			}
		}
	}
}
