class Closure {


    static void main(args) {
        //-----------------Closure creation--------------------- Create
        //-- what parameter/s if any ?, what it returns (this can be tricky, clue- last statement?
        def example = { parameter1,parameter2 ->
            println("Hello ${parameter1} and ${parameter2} ")
            int compute = parameter1 +parameter2
            //String x ='raiaan'
        }

        //-----------------Closure Reading---------------------Read
        //figure out what it returns
        //example.call(4,3)
        System.out.println(example.call(4,3))
    }}