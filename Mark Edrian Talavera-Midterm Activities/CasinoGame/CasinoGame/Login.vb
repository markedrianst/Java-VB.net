Imports System.IO

Public Class Login
    Dim ran As Integer
    Dim rand As New Random()
    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        If String.IsNullOrEmpty(TextBox1.Text) OrElse String.IsNullOrWhiteSpace(TextBox2.Text) Then
            MessageBox.Show("Please fill in all fields any username and password will accept", "Information", MessageBoxButtons.OK, MessageBoxIcon.Information)
        Else
            ran = rand.Next(0, 5)
            PickGame.Picbox1.Image = Image.FromFile(Directory.GetCurrentDirectory & "\Avatars\Avatar" & ran & ".png")
            PickGame.uname = TextBox1.Text
            PickGame.Show()
            Me.Hide()
        End If

    End Sub

    Private Sub Login_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim confirm As DialogResult = MessageBox.Show("Are you sure you want to exit ?", "Confirm", MessageBoxButtons.YesNo, MessageBoxIcon.Question)
        If confirm = DialogResult.Yes Then
            Application.Exit()
        End If
    End Sub

    Private Sub TextBox1_TextChanged(sender As Object, e As EventArgs) Handles TextBox1.TextChanged
        Dim maxCharacters As Integer = 10

        If TextBox1.Text.Length > maxCharacters Then
            MsgBox("Maximum Of 10 Character")
            TextBox1.Text = TextBox1.Text.Substring(0, maxCharacters)
        End If
    End Sub

End Class