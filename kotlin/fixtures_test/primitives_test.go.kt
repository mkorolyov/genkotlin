package fixtures_test

data class PrimitivesV1(
    /** comment here */
    val int: Int,
    
    val int64: Int64,
    
    val float32: Float32,
    
    val float64: Float64,
    
    val bool: Bool,
    
    val string: String,
    
    val map: Map<String,String>,
    
    val slice: List<Int>,
    
    val mapOpt: Map<String,String>,
    
    val mapWithNulls: Map<String,String>,
    
    val sliceOpt: List<Int>,
    
    val omitempty: Omitempty,
    
    val ptr: Int
) {
    data class Int(val value: Int)
    data class Int64(val value: Long)
    data class Float32(val value: Float)
    data class Float64(val value: Double)
    data class Bool(val value: Boolean)
    data class String(val value: String)
    data class Omitempty(val value: Int)

}

