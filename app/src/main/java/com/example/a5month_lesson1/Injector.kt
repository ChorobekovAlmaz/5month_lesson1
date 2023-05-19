package com.example.a5month_lesson1

class Injector{

    companion object{

        fun getPresenter(): Presenter{
            return Presenter()
        }

        fun getModel(): Model{
            return Model()
        }

    }

}