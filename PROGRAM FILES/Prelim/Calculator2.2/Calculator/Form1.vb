Imports System.Reflection.Emit

Public Class Form1
    Private Sub Button18_Click(sender As Object, e As EventArgs) Handles Equals.Click

        If Lbl2.Text = "+" Then
            Label3.Text = TextBox1.Text
            TextBox1.Text = Val(Label1.Text) + Val(TextBox1.Text)
            Label4.Text = "="
        ElseIf Lbl2.Text = "-" Then
            Label3.Text = TextBox1.Text
            TextBox1.Text = Val(Label1.Text) - Val(TextBox1.Text)
            Label4.Text = "="
        ElseIf Lbl2.Text = "*" Then
            Label3.Text = TextBox1.Text
            TextBox1.Text = Val(Label1.Text) * Val(TextBox1.Text)
            Label4.Text = "="
        ElseIf Lbl2.Text = "%" Then
            Label3.Text = TextBox1.Text
            TextBox1.Text = Val(Label1.Text) Mod Val(TextBox1.Text)
            Label4.Text = "="
        ElseIf TextBox1.Text = "0" And Lbl2.Text = "/" Then
            TextBox1.Text = "Cannot be divided by 0!"
        ElseIf Lbl2.Text = "/" Then
            Label3.Text = TextBox1.Text
            TextBox1.Text = Val(Label1.Text) / Val(TextBox1.Text)

            Label4.Text = "="


        ElseIf Lbl2.Text = "^" Then
            Label3.Text = TextBox1.Text
            TextBox1.Text = Val(Label1.Text) ^ Val(TextBox1.Text)
            Label4.Text = "="

        End If
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        TextBox1.Text = TextBox1.Text + "1"
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        TextBox1.Text = TextBox1.Text + "2"
    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        TextBox1.Text = TextBox1.Text + "3"
    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles Button4.Click
        TextBox1.Text = TextBox1.Text + "4"
    End Sub

    Private Sub Button5_Click(sender As Object, e As EventArgs) Handles Button5.Click
        TextBox1.Text = TextBox1.Text + "5"
    End Sub

    Private Sub Button6_Click(sender As Object, e As EventArgs) Handles Button6.Click
        TextBox1.Text = TextBox1.Text + "6"
    End Sub

    Private Sub Button7_Click(sender As Object, e As EventArgs) Handles Button7.Click
        TextBox1.Text = TextBox1.Text + "7"
    End Sub

    Private Sub Button8_Click(sender As Object, e As EventArgs) Handles Button8.Click
        TextBox1.Text = TextBox1.Text + "8"
    End Sub

    Private Sub Button10_Click(sender As Object, e As EventArgs) Handles Button10.Click
        TextBox1.Text = TextBox1.Text + "9"
    End Sub

    Private Sub Button9_Click(sender As Object, e As EventArgs) Handles Button9.Click
        TextBox1.Text = TextBox1.Text + "0"
    End Sub

    Private Sub Button11_Click(sender As Object, e As EventArgs) Handles Button11.Click
        TextBox1.Text = TextBox1.Text + "."
    End Sub

    Private Sub Button12_Click(sender As Object, e As EventArgs) Handles Button12.Click
        Label1.Text = TextBox1.Text
        Lbl2.Text = "+"
        TextBox1.Text = ""
    End Sub

    Private Sub Button13_Click(sender As Object, e As EventArgs) Handles Button13.Click
        Label1.Text = TextBox1.Text
        Lbl2.Text = "*"
        TextBox1.Text = ""
    End Sub

    Private Sub Button14_Click(sender As Object, e As EventArgs) Handles Button14.Click
        Label1.Text = TextBox1.Text
        Lbl2.Text = "-"
        TextBox1.Text = ""
    End Sub

    Private Sub Button15_Click(sender As Object, e As EventArgs) Handles Button15.Click
        Label1.Text = TextBox1.Text
        Lbl2.Text = "/"
        TextBox1.Text = ""
    End Sub

    Private Sub Button16_Click(sender As Object, e As EventArgs) Handles Button16.Click
        Label1.Text = TextBox1.Text
        Lbl2.Text = "%"
        TextBox1.Text = ""
    End Sub

    Private Sub Button17_Click(sender As Object, e As EventArgs) Handles Button17.Click
        Label1.Text = TextBox1.Text
        Lbl2.Text = "^"
        TextBox1.Text = ""
    End Sub

    Private Sub Button19_Click(sender As Object, e As EventArgs) Handles AC.Click
        TextBox1.Text = ""
        Label1.Text = ""
        Lbl2.Text = ""
        Label3.Text = ""
        Label4.Text = ""
    End Sub

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub TextBox1_TextChanged(sender As Object, e As EventArgs) Handles TextBox1.TextChanged

    End Sub
End Class
