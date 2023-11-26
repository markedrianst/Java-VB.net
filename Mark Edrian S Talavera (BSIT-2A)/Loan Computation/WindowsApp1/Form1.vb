
Public Class Form1
    Dim lrnNo As Integer = 1
    Private Sub Form1_load(sender As Object, e As EventArgs) Handles MyBase.Load
        LRN.Text = lrnNo.ToString("00000")
        LRNint.Text = lrnNo.ToString("00000")
    End Sub
    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        If String.IsNullOrEmpty(LRNint.Text) OrElse String.IsNullOrEmpty(AcNoin.Text) OrElse String.IsNullOrEmpty(Namein.Text) OrElse String.IsNullOrEmpty(address.Text) OrElse String.IsNullOrEmpty(Amountl.Text) OrElse String.IsNullOrEmpty(interate.Text) OrElse String.IsNullOrEmpty(years.Text) Then
            MessageBox.Show("Please fill out all required fields.", "Incomplete Information", MessageBoxButtons.OK, MessageBoxIcon.Warning)
        ElseIf Not IsNumeric(LRNint.Text) Then
            MessageBox.Show("Please Fill the Loan Reference Properly ", "Invalid Input", MessageBoxButtons.OK, MessageBoxIcon.Warning)

        ElseIf Not IsNumeric(AcNoin.Text) Then
            MessageBox.Show("Please Fill the Acount No Properly ", "Invalid Input", MessageBoxButtons.OK, MessageBoxIcon.Warning)

        ElseIf IsNumeric(Namein.Text) Then
            MessageBox.Show("Please Fill the Name  Properly ", "Invalid Input", MessageBoxButtons.OK, MessageBoxIcon.Warning)

        ElseIf IsNumeric(address.Text) Then
            MessageBox.Show("Please Fill the Address Properly ", "Invalid Input", MessageBoxButtons.OK, MessageBoxIcon.Warning)


        ElseIf Not IsNumeric(Amountl.Text) Then
            MessageBox.Show("Please Fill the Amount Loan Properly ", "Invalid Input", MessageBoxButtons.OK, MessageBoxIcon.Warning)

        ElseIf Not IsNumeric(interate.Text) Then
            MessageBox.Show("Please Fill the Interest Rate Properly ", "Invalid Input", MessageBoxButtons.OK, MessageBoxIcon.Warning)
        Else
            LRN.Text = LRNint.Text
            acno.Text = AcNoin.Text
            Yname.Text = Namein.Text
            addrs.Text = address.Text
            amounln.Text = Amountl.Text
            ir.Text = interate.Text
            yearstopay.Text = years.Text

            MonthlyPay.Text = Val(Amountl.Text) * Val(interate.Text) / 100 * Val(years.Text) / 12
            Ti.Text = Val(Amountl.Text) * Val(interate.Text) / 100 * Val(years.Text)
            TLN.Text = Val(Ti.Text) * Val(years.Text)
            TAP.Text = Val(TLN.Text) / Val(years.Text)

            MonthlyPay.Text = Format(Val(MonthlyPay.Text), "₱#,##.00")
            Ti.Text = Format(Val(Ti.Text), "₱#,##.00")
            TLN.Text = Format(Val(TLN.Text), "₱#,##.00")
            TAP.Text = Format(Val(TAP.Text), "₱#,##.00")

            MessageBox.Show("Data submitted successfully!", "Success", MessageBoxButtons.OK, MessageBoxIcon.Information)
        End If

    End Sub
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        If String.IsNullOrEmpty(LRNint.Text) OrElse String.IsNullOrEmpty(AcNoin.Text) OrElse String.IsNullOrEmpty(Namein.Text) OrElse String.IsNullOrEmpty(address.Text) OrElse String.IsNullOrEmpty(Amountl.Text) OrElse String.IsNullOrEmpty(interate.Text) OrElse String.IsNullOrEmpty(years.Text) Then
            MessageBox.Show("You Don't Have To Clear", "Incomplete Information", MessageBoxButtons.OK, MessageBoxIcon.Warning)
        Else
            Dim result As DialogResult = MessageBox.Show("Are you sure You want to clear all fields?", "Confirmation", MessageBoxButtons.YesNo)
            If result = DialogResult.Yes Then
                lrnNo = CInt(LRNint.Text)
                lrnNo += 1
                LRN.Text = lrnNo.ToString("00000")
                LRNint.Text = lrnNo.ToString("00000")
                acno.Text = ""
                AcNoin.Text = ""
                Yname.Text = ""
                Namein.Text = ""
                addrs.Text = ""
                address.Text = ""
                amounln.Text = ""
                Amountl.Text = ""
                ir.Text = ""
                interate.Text = ""
                yearstopay.Text = ""
                years.Text = ""
                MonthlyPay.Text = ""
                Ti.Text = ""
                TAP.Text = ""
                TLN.Text = ""
                MessageBox.Show("Successfully Cleared")
            End If
        End If

    End Sub
End Class
