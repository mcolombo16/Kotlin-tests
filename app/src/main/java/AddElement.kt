fun main() {
    var arr = arrayOf<Int>(10,20,30,40,50)
    arr = addElement(arr, 60)
    for(ch in arr){
        println(ch)
    }
  }

        fun addElement(arr:Array<Int>, element:Int): Array<Int>{
            val mutableArray = arr.toMutableList()
            mutableArray.add(element)
            return mutableArray.toTypedArray()
        }