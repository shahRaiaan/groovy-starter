class HashMapPractice {

    static void main(args) {
        // HashMap Create
        System.out.println('-----------------HashMap Create Begin---------------------') // ArrayList Create + print

        //def colors = [red: '#FF0000', green: '#00FF00', blue: '#0000FF'] //declaration option 1
        def colors = [:]// declaration option 2
        colors.red = '#FF0000'
        colors.green = '#00FF00'
        colors.blue = '#0000FF'

        assert colors['red'] == '#FF0000'

        System.out.println('-----------------HashMap Create End---------------------')
        // HashMap Read + loop
        System.out.println('-----------------HashMap Read Begin---------------------')
        System.out.println(colors['red'])


        for (String letter : colors) {
            System.out.println(letter)
        }

        colors.each {println it}
        colors.each {println "${it.key} maps to: ${it.value}"}
        System.out.println('-----------------HashMap Read End---------------------')


        // HashMap Update
        System.out.println('-----------------HashMap Update Begin---------------------')
        colors['red'] = 'updated'
        colors.each {println it}

        System.out.println('-----------------HashMap Update End---------------------')

        // HashMap Delete
        System.out.println('-----------------HashMap Delete Begin---------------------')
        colors.remove('red')
        colors.each{println it}

        System.out.println('-----------------HashMap Delete End---------------------')
    }


}