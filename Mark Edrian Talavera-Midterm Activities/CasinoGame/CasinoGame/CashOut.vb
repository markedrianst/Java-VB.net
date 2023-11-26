Public Class CashOut
    Public amount As Double
    Public amount1 As Double
    Public amount2 As Double
    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        If IsNumeric(TextBox1.Text) Then
            If PickGame.amount3 < TextBox1.Text Then
                MessageBox.Show("You don't have enough money!", "Information", MessageBoxButtons.OK, MessageBoxIcon.Information)
            Else
                If PickGame.amount3 = TextBox1.Text Then
                    PickGame.amount3 = 0
                    PickGame.Label1.Text = "₱ 0.0"
                    MessageBox.Show("Successfully Cash Out", "Information ", MessageBoxButtons.OK, MessageBoxIcon.Information)
                    PickGame.Show()
                    Me.Close()
                Else
                    amount = TextBox1.Text
                    PickGame.amount3 = amount1 - amount
                    amount2 = amount1 - amount
                    PickGame.Label1.Text = Format(amount2, "₱ #,##.##")
                    MessageBox.Show("Successfully Cash Out", "Information ", MessageBoxButtons.OK, MessageBoxIcon.Information)
                    PickGame.Show()
                    Me.Close()
                End If

            End If
                Else
            MessageBox.Show("Input amount", "Information ", MessageBoxButtons.OK, MessageBoxIcon.Information)
        End If
    End Sub
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim cancel As DialogResult = MessageBox.Show("Cancel?", "Confirm", MessageBoxButtons.YesNo, MessageBoxIcon.Question)
        If cancel = DialogResult.Yes Then
            Me.Close()
            PickGame.Show()

        End If
    End Sub

    Private Sub CashOut_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub TextBox1_TextChanged(sender As Object, e As EventArgs) Handles TextBox1.TextChanged
        Dim maxCharacters As Integer = 10
        If TextBox1.Text.Length > maxCharacters Then
            MsgBox("Maximum Of 10 numbers")
            TextBox1.Text = TextBox1.Text.Substring(0, maxCharacters)
        End If
    End Sub
End Class