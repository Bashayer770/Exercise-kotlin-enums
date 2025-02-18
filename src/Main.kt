fun main() {
var admin = UserRole.ADMIN
    var editor = UserRole.EDITOR
    var viewer = UserRole.VIEWER

var res = permission(editor,2)
println(res)

    for(roles in UserRole.entries){
        println(roles.name)
    }


}

enum class UserRole(){
    ADMIN ,
    EDITOR,
    VIEWER
}


fun permission(userRole: UserRole,  required:Int): Boolean{
val accessLevel = when(userRole){
    UserRole.ADMIN -> 3
    UserRole.EDITOR ->2
    UserRole.VIEWER -> 1

}
    return accessLevel >= required
}

