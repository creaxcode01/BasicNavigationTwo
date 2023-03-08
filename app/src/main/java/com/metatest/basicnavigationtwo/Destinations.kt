package com.metatest.basicnavigationtwo

interface Destinations {
    val route:String


}

object Dashboard : Destinations { // un objet est instanciable mais pas une valeur contenue dans une interface
    override val route = "Enter what you want"

}

object Detail : Destinations {  // un objet est instanciable mais pas une valeur contenue dans une interface
    override val route = "Enter what you want two"

}

