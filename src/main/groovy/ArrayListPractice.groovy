class ArrayListPractice {

    static void main(args) {
        System.out.println('-----------------ArrayList Create Begin---------------------') // ArrayList Create + print
        def letters = ['a', 'b', 'c', 'd']
        System.out.println(letters)
        assert letters[1] == 'b'
        System.out.println('-----------------ArrayList Create End---------------------')

// ArrayList Read + loop
        System.out.println('-----------------ArrayList Read Begin---------------------')
        System.out.println(letters[2])


        for (String letter : letters) { // option 1 using loop
            System.out.println(letter)
        }

        letters.each {println it}//option 2 using closure and it variable
        System.out.println('-----------------ArrayList Read End---------------------')


// ArrayList Update (also create)
        System.out.println('-----------------ArrayList Update Begin---------------------')
        letters.add('f')
        System.out.println(letters)

        letters[0]= 'z' //can also be written as - letters.set(0,'z')
        System.out.println(letters)
        System.out.println('-----------------ArrayList Update End---------------------')

// ArrayList Delete
        System.out.println('-----------------ArrayList Delete Begin---------------------')
        letters.remove('f')
        System.out.println(letters)
        System.out.println('-----------------ArrayList Delete Begin---------------------')

    }


}