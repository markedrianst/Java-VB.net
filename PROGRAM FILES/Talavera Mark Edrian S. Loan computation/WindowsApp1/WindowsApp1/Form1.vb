Imports System.ComponentModel
Imports System.Windows.Forms.VisualStyles.VisualStyleElement

Public Class Form1
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

            Dim RateInt As Double = interate.Text / 100 / 12
            Dim payYear As Integer = yearstopay.Text * 12

            Dim monthpay As Double = amounln.Text * (RateInt * Math.Pow(1 + RateInt, payYear)) / (Math.Pow(1 + RateInt, payYear) - 1)
            Dim totalInt As Double = (monthpay * payYear) - amounln.Text
            Dim totalAml As Double = monthpay * 12
            Dim totalPay As Double = monthpay * payYear

            MonthlyPay.Text = monthpay.ToString("C")
            Ti.Text = totalInt.ToString("C")
            TAP.Text = totalAml.ToString("C")
            TLN.Text = totalPay.ToString("C")
            MessageBox.Show("Data submitted successfully!", "Success", MessageBoxButtons.OK, MessageBoxIcon.Information)
        End If

    End Sub
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        If String.IsNullOrEmpty(LRNint.Text) OrElse String.IsNullOrEmpty(AcNoin.Text) OrElse String.IsNullOrEmpty(Namein.Text) OrElse String.IsNullOrEmpty(address.Text) OrElse String.IsNullOrEmpty(Amountl.Text) OrElse String.IsNullOrEmpty(interate.Text) OrElse String.IsNullOrEmpty(years.Text) Then
            MessageBox.Show("You Don't Have To Clear", "Incomplete Information", MessageBoxButtons.OK, MessageBoxIcon.Warning)
        Else
            Dim result As DialogResult = MessageBox.Show("Are you sure You want to clear all fields?", "Confirmation", MessageBoxButtons.YesNo)
            If result = DialogResult.Yes Then
                LRN.Text = ""
                LRNint.Text = ""
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
