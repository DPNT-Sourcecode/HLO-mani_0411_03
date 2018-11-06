Namespace Solutions.HLO
    Public Class Hello
        Public Shared Function Hello(friendName As String) As Object
            if friendName = "" then
                Return "Hello, World!"
            end if
            Return "Hello, " + friendName + "!"
        End Function
    End Class
End NameSpace
