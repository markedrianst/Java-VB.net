Imports System.Windows.Forms.VisualStyles.VisualStyleElement
Public Class Form1
    Private Sub Panel1_Paint(sender As Object, e As PaintEventArgs) Handles Panel1.Paint
        Panel1.BackColor = Color.FromArgb(100, 0, 0, 0)
    End Sub
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        ortb.Text = frbx.SelectedItem
        tbx.Text = dttb1.SelectedItem
        ortb.Text = frbx.SelectedItem
        dttb1.Text = dttb1.SelectedItem
        dcbx.Text = dcbx.SelectedItem
        If frbx.SelectedIndex <> dttb1.SelectedIndex Then
            gfare.Text = Math.Abs(frbx.SelectedIndex - dttb1.SelectedIndex) * 20
            Dim discountRate As Double
            Select Case dcbx.SelectedIndex.ToString()

                Case 0
                    discountRate = 0
                Case 1
                    discountRate = 0.1
                Case 2
                    discountRate = 0.15
                Case 3
                    discountRate = 0.2
                Case 4
                    discountRate = 0.5
            End Select

            Dim discountAmount As Double = Val(gfare.Text) * discountRate
            netfare.Text = (Val(gfare.Text) - discountAmount)
            dct.Text = discountAmount
            Button3.Enabled = True
            Button5.Enabled = False
        ElseIf frbx.SelectedIndex = dttb1.SelectedIndex Then
            MessageBox.Show("Invalid Input ", "Fill all comboBox", MessageBoxButtons.OK, MessageBoxIcon.Information)
        End If

    End Sub
    Private Sub Close1_Click(sender As Object, e As EventArgs) Handles Close1.Click
        Dim result As DialogResult = MessageBox.Show("Are you sure you want to exit?", "Confirmation", MessageBoxButtons.YesNo, MessageBoxIcon.Question)
        If result = DialogResult.Yes Then
            Me.Close()
        End If
    End Sub
    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles Button4.Click
        Dim currentValue As Integer = Integer.Parse(txtResult.Text)
        Dim result As DialogResult = MessageBox.Show("Another transaction?", "Confirmation", MessageBoxButtons.YesNo)
        If result = DialogResult.Yes Then
            ortb.Text = ""
            tbx.Text = ""
            gfare.Text = ""
            ortb.Text = ""
            frbx.SelectedItem = Nothing
            dttb1.SelectedItem = Nothing
            dcbx.SelectedItem = Nothing
            netfare.Text = ""
            dct.Text = ""
            Button4.Enabled = False
            Button3.Enabled = False
            Button5.Enabled = True
            Button1.Enabled = True
            currentValue += 1
            txtResult.Text = currentValue.ToString("00000")
        End If
    End Sub

    Private Sub Minimize_Click(sender As Object, e As EventArgs) Handles Minimize.Click
        Me.WindowState = FormWindowState.Minimized
    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        Dim result As DialogResult = MessageBox.Show("Proceed To Print ?", "Confirmation", MessageBoxButtons.YesNo, MessageBoxIcon.Question)
        If result = DialogResult.Yes Then
            Dim myForm2 As New Form2()
            myForm2.fromRec.Text = ortb.Text
            myForm2.toRec.Text = tbx.Text
            myForm2.grossRec.Text = gfare.Text
            myForm2.disRec.Text = dct.Text
            myForm2.totRec.Text = netfare.Text
            myForm2.incRec.Text = txtResult.Text
            myForm2.Show()
            Button4.Enabled = True
            Button1.Enabled = False
        End If
    End Sub
    Private Sub Button5_Click(sender As Object, e As EventArgs) Handles Button5.Click
        Dim result As DialogResult = MessageBox.Show("Cancel Transaction", "Confirmation", MessageBoxButtons.YesNo, MessageBoxIcon.Question)
        If result = DialogResult.Yes Then
            frbx.SelectedItem = Nothing
            dttb1.SelectedItem = Nothing
            dcbx.SelectedItem = Nothing
        End If
    End Sub
End Class
