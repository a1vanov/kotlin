// !DIAGNOSTICS: -UNUSED_PARAMETER

class C {
    <!CONFLICTING_PLATFORM_DECLARATIONS!>fun setX(x: Int)<!> {}

    <!CONFLICTING_PLATFORM_DECLARATIONS!>var x: Int<!> = 1
}