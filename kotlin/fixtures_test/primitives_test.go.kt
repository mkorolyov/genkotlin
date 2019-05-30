package fixtures_test

data class PrimitivesV1(
    /** comment here */
    val int: Int,
    
    val int64: Long,
    
    val float32: Float,
    
    val float64: Double,
    
    val bool: Boolean,
    
    val string: String,
    
    val map: Map<String,String>,
    
    val slice: List<Int>,
    
    val mapOpt: Map<String,String>,
    
    val mapWithNulls: Map<String,String>,
    
    val sliceOpt: List<Int>,
    
    val omitempty: Int,
    
    val ptr: Int
) { }


