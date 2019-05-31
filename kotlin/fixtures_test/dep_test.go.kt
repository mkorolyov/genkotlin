package fixtures_test

data class Dep1(
    
    val str: Str
) {
    data class Str(val value: String)

}

data class Dep2(
    
    val str: Str
) {
    data class Str(val value: String)

}

data class Dep3(
    
    val str: Str
) {
    data class Str(val value: String)

}

data class Dep4(
    
    val str: Str
) {
    data class Str(val value: String)

}

data class Dep5(
    
    val str: Str
) {
    data class Str(val value: String)

}

data class Dep6(
    
    val dep5: Dep5
) { }

data class Dep(
    
    val int: Int,
    
    val dep1: Dep1,
    
    val dep2Opt: Dep2?,
    
    val dep3Array: List<Dep3>?,
    
    val dep4Map: Map<String,Dep4>?,
    
    val depWithDep: Dep6
) {
    data class Int(val value: Int)

}

data class Optional(
    
    val int: Int
) {
    data class Int(val value: Int)

}

data class StructV1(
    
    val dep: Dep,
    
    val optional: Optional
) { }

