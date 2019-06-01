package kotlin

import "text/template"

//TODO imports
const tmpl = `package {{$.Package}}
{{ range $class := .Classes}}
data class {{$class.Name}}({{ range $index, $element := $class.Fields }}
    {{if $element.Doc}}/** {{$element.Doc}} */{{end}}
    val {{$element.Name}}: {{$element.Type}}{{if $element.Optional}}?{{end}}{{if not (isLastElem (len $class.Fields) $index)}},{{end}}{{end}}
){{if $class.DataClasses}} {
{{ range $dc := $class.DataClasses}}    data class {{$dc.Name}}(val value: {{$dc.Type}})
{{end}}
}{{else}} { }{{end}}
{{end}}
`

var isLastElemFn = template.FuncMap{
	// The name "isLastElem" is what the function will be called in the template text.
	"isLastElem": func(len, i int) bool {
		return len-1 == i
	},
}


type File struct {
	Classes []Class
	Package string
}

type Class struct {
	Name        string
	Fields      []Field
	DataClasses []DataClass
}

type DataClass struct {
	Name string
	Type string
}

type Field struct {
	Name     string
	Doc      string
	Type     string
	Optional bool
}