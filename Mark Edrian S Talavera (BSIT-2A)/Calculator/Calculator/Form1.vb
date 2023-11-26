Imports System.Net.Mime.MediaTypeNames
Imports System.Windows.Forms.VisualStyles.VisualStyleElement
Public Class Form1
    Dim num1 As Decimal
    Dim num2 As Decimal
    Dim result As Integer
    Dim selector As Boolean = False
    Private Sub one_Click(sender As Object, e As EventArgs) Handles one.Click
        If txt.Text = "Error!" Then
            txt.Text = "1"
        ElseIf txt.Text <> "0" Then
            txt.Text += "1"
        Else
            txt.Text = "1"
        End If
    End Sub
    Private Sub two_Click(sender As Object, e As EventArgs) Handles two.Click
        If txt.Text = "Error!" Then
            txt.Text = "2"
        ElseIf txt.Text <> "0" Then
            txt.Text += "2"
        Else
            txt.Text = "2"
        End If
    End Sub
    Private Sub three_Click(sender As Object, e As EventArgs) Handles three.Click
        If txt.Text = "Error!" Then
            txt.Text = "3"
        ElseIf txt.Text <> "0" Then
            txt.Text += "3"
        Else
            txt.Text = "3"
        End If
    End Sub
    Private Sub four_Click(sender As Object, e As EventArgs) Handles four.Click
        If txt.Text = "Error!" Then
            txt.Text = "4"
        ElseIf txt.Text <> "0" Then
            txt.Text += "4"
        Else
            txt.Text = "4"
        End If
    End Sub
    Private Sub five_Click(sender As Object, e As EventArgs) Handles five.Click
        If txt.Text = "Error!" Then
            txt.Text = "5"
        ElseIf txt.Text <> "0" Then
            txt.Text += "5"
        Else
            txt.Text = "5"
        End If
    End Sub
    Private Sub six_Click(sender As Object, e As EventArgs) Handles six.Click
        If txt.Text = "Error!" Then
            txt.Text = "6"
        ElseIf txt.Text <> "0" Then
            txt.Text += "6"
        Else
            txt.Text = "6"
        End If
    End Sub
    Private Sub sev_Click(sender As Object, e As EventArgs) Handles seven.Click
        If txt.Text = "Error!" Then
            txt.Text = "7"
        ElseIf txt.Text <> "0" Then
            txt.Text += "7"
        Else
            txt.Text = "7"
        End If
    End Sub
    Private Sub eig_Click(sender As Object, e As EventArgs) Handles eight.Click
        If txt.Text = "Error!" Then
            txt.Text = "8"
        ElseIf txt.Text <> "0" Then
            txt.Text += "8"
        Else
            txt.Text = "8"
        End If
    End Sub
    Private Sub nine_Click(sender As Object, e As EventArgs) Handles nine.Click
        If txt.Text = "Error!" Then
            txt.Text = "9"
        ElseIf txt.Text <> "0" Then
            txt.Text += "9"
        Else
            txt.Text = "9"
        End If
    End Sub
    Private Sub zero_Click(sender As Object, e As EventArgs) Handles zero.Click
        If txt.Text = "Error!" Then
            txt.Text = "0"
        ElseIf txt.Text <> "0" Then
            txt.Text += "0"
        End If
    End Sub
    Private Sub reset_Click(sender As Object, e As EventArgs) Handles reset.Click
        txt.Text = "0"
    End Sub
    Private Sub pnt_Click(sender As Object, e As EventArgs) Handles pnt.Click
        If Not (txt.Text.Contains(".")) Then
            txt.Text += "."
        End If
    End Sub
    Private Sub plus_Click(sender As Object, e As EventArgs) Handles plus.Click
        If String.IsNullOrEmpty(txt.Text) Then
            txt.Text = "0"
        Else
            num1 = txt.Text
            txt.Text = "0"
            selector = True
            result = 1 ' = +
        End If
    End Sub
    Private Sub subt_Click(sender As Object, e As EventArgs) Handles subt.Click
        If String.IsNullOrEmpty(txt.Text) Then
            txt.Text = "0"
        Else
            num1 = txt.Text
            txt.Text = "0"
            selector = True
            result = 2 ' = -
        End If
    End Sub
    Private Sub mtp_Click(sender As Object, e As EventArgs) Handles mtp.Click
        If String.IsNullOrEmpty(txt.Text) Then
            txt.Text = "0"
        Else
            num1 = txt.Text
            txt.Text = "0"
            selector = True
            result = 3 ' = *
        End If
    End Sub
    Private Sub dvd_Click(sender As Object, e As EventArgs) Handles dvd.Click
        If String.IsNullOrEmpty(txt.Text) Then
            txt.Text = "0"
        Else
            num1 = txt.Text
            txt.Text = "0"
            selector = True
            result = 4 ' /
        End If

    End Sub
    Private Sub mods_Click(sender As Object, e As EventArgs) Handles mods.Click
        num1 = txt.Text
        txt.Text = "0"
        selector = True
        result = 5 ' Mod
    End Sub
    Private Sub exp_Click(sender As Object, e As EventArgs) Handles exp.Click
        If String.IsNullOrEmpty(txt.Text) Then
            txt.Text = "0"
        Else
            num1 = txt.Text
            txt.Text = "0"
            selector = True
            result = 6 ' ^
        End If
    End Sub
    Private Sub equal_Click(sender As Object, e As EventArgs) Handles equal.Click
        If selector = True Then
            num2 = txt.Text
            If result = 1 Then
                txt.Text = num1 + num2
            ElseIf result = 2 Then
                txt.Text = num1 - num2
            ElseIf result = 3 Then
                txt.Text = num1 * num2
            ElseIf result = 4 Then
                If num2 = 0 Then
                    txt.Text = "Error!"
                Else
                    txt.Text = num1 / num2
                End If
            ElseIf result = 5 Then
                txt.Text = num1 Mod num2
            ElseIf result Then
                txt.Text = num1 ^ num2
            End If
            selector = False
        End If
    End Sub
    Private Sub bsp_Click(sender As Object, e As EventArgs) Handles bsp.Click
        If txt.Text.Length > 0 Then
            txt.Text = txt.Text.Remove(txt.Text.Length - 1, 1)
        End If
    End Sub
    Private Sub TextBox1_KeyPress(sender As Object, e As KeyPressEventArgs) Handles txt.KeyPress
        If Not Char.IsDigit(e.KeyChar) AndAlso Not Char.IsControl(e.KeyChar) Then
            e.Handled = True
            txt.Text = "Error!"
        ElseIf Char.IsDigit(e.KeyChar) Then
            txt.Text = ""
        End If
    End Sub

    Private Sub Calculator_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Me.Padding = New Padding(2)
    End Sub
End Class
