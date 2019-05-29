package test

data class PrimitivesV1(
    /** comment here */
    val Int: Int,
    
    val Int64: Long,
    
    val Float32: Float,
    
    val Float64: Double,
    
    val Bool: Boolean,
    
    val String: String,
    
    val Map: Map<String,String>,
    
    val Slice: List<Int>,
    
    val MapOpt: Map<String,String>,
    
    val MapWithNulls: Map<String,String>,
    
    val SliceOpt: List<Int>,
    
    val Omitempty: Int,
    
    val Ptr: Int,
) { }


