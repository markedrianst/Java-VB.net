Public Class LoadingScreen
    Declare Auto Function SendMessage Lib "user32.dll" (ByVal hWnd As IntPtr, ByVal msg As Integer, ByVal wParam As Integer, ByVal lParam As Integer) As Integer
    Enum ProgressBarColor
        Green = &H1
        Red = &H2
        Yellow = &H3
        Blue = &H4
    End Enum
    Private Sub Timer1_Tick(sender As Object, e As EventArgs) Handles Timer1.Tick

        Me.ProgressBar1.Value = ProgressBar1.Value + 1
        If ProgressBar1.Value >= 100 Then
            Timer1.Stop()
            Login.Show()
            Me.Hide()
        End If
    End Sub

    Private Sub LoadingScreen_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub
End Class
