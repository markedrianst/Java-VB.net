Public Class PickGame
    Public uname As String
    Public amount3 As Double
    Public Jackpot As Integer = 10000
    Private Sub PickGame_Load(sender As Object, e As EventArgs) Handles MyBase.Load

        Button1.Image = My.Resources.Rectangle_16
        Button2.Image = My.Resources.Rectangle_16
        Button3.Image = My.Resources.Rectangle_16
        Button4.Image = My.Resources.Rectangle_16
        Button5.Image = My.Resources.Rectangle_4
        Button6.Image = My.Resources.Rectangle_5
        Label1.Text = 0
        Un.Text = uname

    End Sub
    Private Sub Button1_MouseLeave(sender As Object, e As EventArgs) Handles Button1.MouseLeave
        Button1.Image = My.Resources.Rectangle_16
    End Sub
    Private Sub Button1_MouseEnter(sender As Object, e As EventArgs) Handles Button1.MouseEnter
        Button1.Image = My.Resources.RectangleHover
    End Sub
    Private Sub Button2_MouseLeave(sender As Object, e As EventArgs) Handles Button2.MouseLeave
        Button2.Image = My.Resources.Rectangle_16
    End Sub
    Private Sub Button2_MouseEnter(sender As Object, e As EventArgs) Handles Button2.MouseEnter
        Button2.Image = My.Resources.RectangleHover
    End Sub
    Private Sub Button3_MouseLeave(sender As Object, e As EventArgs) Handles Button3.MouseLeave
        Button3.Image = My.Resources.Rectangle_16
    End Sub
    Private Sub Button3_MouseEnter(sender As Object, e As EventArgs) Handles Button3.MouseEnter
        Button3.Image = My.Resources.RectangleHover
    End Sub
    Private Sub Button4_MouseLeave(sender As Object, e As EventArgs) Handles Button4.MouseLeave
        Button4.Image = My.Resources.Rectangle_16
    End Sub
    Private Sub Button4_MouseEnter(sender As Object, e As EventArgs) Handles Button4.MouseEnter
        Button4.Image = My.Resources.RectangleHover
    End Sub
    Private Sub Button5_MouseLeave(sender As Object, e As EventArgs) Handles Button5.MouseLeave
        Button5.Image = My.Resources.Rectangle_4
    End Sub
    Private Sub Button5_MouseEnter(sender As Object, e As EventArgs) Handles Button5.MouseEnter
        Button5.Image = My.Resources.Rectangle_h
    End Sub
    Private Sub Button6_MouseLeave(sender As Object, e As EventArgs) Handles Button6.MouseLeave
        Button6.Image = My.Resources.Rectangle_5
    End Sub
    Private Sub Button6_MouseEnter(sender As Object, e As EventArgs) Handles Button6.MouseEnter
        Button6.Image = My.Resources.Rectangle_5_h
    End Sub
    Private Sub Button7_Click(sender As Object, e As EventArgs) Handles Button7.Click
        Dim confirm As DialogResult = MessageBox.Show("Are you sure you want to exit ?", "Confirm", MessageBoxButtons.YesNo, MessageBoxIcon.Question)
        If confirm = DialogResult.Yes Then
            Application.Exit()
        End If
    End Sub
    Private Sub Button5_Click(sender As Object, e As EventArgs) Handles Button5.Click
        Dim result As DialogResult = MessageBox.Show("Continue to cash in?", "Information", MessageBoxButtons.YesNo, MessageBoxIcon.Question)
        If result = DialogResult.Yes Then
            CashIn.amount1 = amount3
            CashIn.Show()
            Me.Hide()
        End If
    End Sub

    Private Sub Button6_Click(sender As Object, e As EventArgs) Handles Button6.Click
        If amount3 = 0 Then
            MessageBox.Show("Insuficient balance", "Information", MessageBoxButtons.OK, MessageBoxIcon.Information)

        Else
            Dim result As DialogResult = MessageBox.Show("Please Confirm", "CashOut", MessageBoxButtons.OKCancel, MessageBoxIcon.Information)
            If result = DialogResult.OK Then
                CashOut.amount1 = amount3
                CashOut.Show()
                Me.Hide()
            End If
        End If
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        If amount3 = 0 Then
            MessageBox.Show("You need to Cash in First !", "Information", MessageBoxButtons.YesNo, MessageBoxIcon.Exclamation)
        Else
            Me.Hide()
            SlotsMachine.jackpot = Jackpot
            SlotsMachine.TextBox2.Text = Jackpot
            SlotsMachine.Label1.Text = Un.Text
            SlotsMachine.PictureBox5.Image = Picbox1.Image
            SlotsMachine.BAL.Text = Format(amount3, "₱ #,##.##")
            SlotsMachine.balance = amount3
            SlotsMachine.Show()
        End If

    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles Button4.Click
        If amount3 = 0 Then
            MessageBox.Show("You need to Cash in First !", "Information", MessageBoxButtons.YesNo, MessageBoxIcon.Exclamation)
        Else
            Me.Hide()
            TossCoin.Label1.Text = Format(amount3, "₱ #,##.##")
            TossCoin.balance = amount3
            TossCoin.Show()
        End If

    End Sub
    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        If amount3 = 0 Then
            MessageBox.Show("You need to Cash in First !", "Information", MessageBoxButtons.YesNo, MessageBoxIcon.Exclamation)
        Else
            Me.Hide()
            JackAndPoy.Label1.Text = Un.Text
            JackAndPoy.PictureBox1.Image = Picbox1.Image
            JackAndPoy.TextBox1.Text = Format(amount3, "₱ #,##.##")
            JackAndPoy.balance = amount3
            JackAndPoy.Show()
        End If
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        If amount3 = 0 Then
            MessageBox.Show("You need to Cash in First !", "Information", MessageBoxButtons.YesNo, MessageBoxIcon.Exclamation)
        Else
            Me.Hide()
            Lucky9.Label2.Text = Un.Text
            Lucky9.PictureBox8.Image = Picbox1.Image
            Lucky9.Betamount.Text = Format(amount3, "₱ #,##.##")
            Lucky9.balance = amount3
            Lucky9.Show()
        End If
    End Sub

    Private Sub Button8_Click(sender As Object, e As EventArgs) Handles Button8.Click
        Dim log As DialogResult = MessageBox.Show("Are you sure you want to log out ?", "questioning ", MessageBoxButtons.YesNo, MessageBoxIcon.Question)
        If log = DialogResult.Yes Then
            Me.Close()
            Login.Show()
        End If
    End Sub
End Class