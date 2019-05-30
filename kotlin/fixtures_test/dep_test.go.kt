package test

data class Dep1(
    
    val Str: String
) { }


data class Dep2(
    
    val Str: String
) { }


data class Dep3(
    
    val Str: String
) { }


data class Dep4(
    
    val Str: String
) { }


data class Dep5(
    
    val Str: String
) { }


data class Dep6(
    
    val Dep5: Dep5
) { }


data class Dep(
    
    val Int: Int,
    
    val Dep1: Dep1,
    
    val Dep2Opt: Dep2,
    
    val Dep3Array: List<Dep3>,
    
    val Dep4Map: Map<String,Dep4>,
    
    val DepWithDep: Dep6
) { }


data class Optional(
    
    val Int: Int
) { }


data class StructV1(
    
    val Dep: Dep,
    
    val Optional: Optional
) { }


