Imports System.Net
Imports System.Windows.Forms.VisualStyles.VisualStyleElement

Public Class Form1
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        If String.IsNullOrEmpty(neym.Text) OrElse String.IsNullOrEmpty(Dep.Text) OrElse String.IsNullOrEmpty(WorkH.Text) OrElse String.IsNullOrEmpty(OT.Text) OrElse String.IsNullOrEmpty(OTR.Text) Then
            MessageBox.Show("You Don't Have To Clear", "Incomplete Information", MessageBoxButtons.OK, MessageBoxIcon.Warning)
        Else
            Dim result As DialogResult = MessageBox.Show("Are you sure You want to clear all fields?", "Confirmation", MessageBoxButtons.YesNo)
            If result = DialogResult.Yes Then
                neym.Text = ""
                neyms.Text = ""
                Dep.Text = ""
                Department.Text = ""
                WorkH.Text = ""
                WorkingHours.Text = ""
                RegRate.Text = ""
                RegularRate.Text = ""
                OT.Text = ""
                Overtime.Text = " "
                OTR.Text = ""
                OvertimeRate.Text = ""
                GrossSalary.Text = ""
                Deduct.Text = ""
                SSS.Text = ""
                PhilHealth.Text = ""
                PagIbig.Text = ""
                IncomeTax.Text = ""
                TD.Text = ""
                NetPay.Text = ""
                MessageBox.Show("Successfully Cleared")
            End If
        End If
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        If String.IsNullOrEmpty(neym.Text) OrElse String.IsNullOrEmpty(Dep.Text) OrElse String.IsNullOrEmpty(WorkH.Text) OrElse String.IsNullOrEmpty(RegRate.Text) OrElse String.IsNullOrEmpty(OT.Text) OrElse String.IsNullOrEmpty(OTR.Text) Then
            MessageBox.Show("Please fill out all required fields.", "Incomplete Information", MessageBoxButtons.OK, MessageBoxIcon.Warning)
        ElseIf IsNumeric(neym.Text) Then
            MessageBox.Show("Please Fill the Name  Properly ", "Invalid Input", MessageBoxButtons.OK, MessageBoxIcon.Warning)
        ElseIf IsNumeric(Dep.Text) Then
            MessageBox.Show("Please Fill the Department Properly ", "Invalid Input", MessageBoxButtons.OK, MessageBoxIcon.Warning)
        ElseIf Not IsNumeric(WorkH.Text) Then
            MessageBox.Show("Please Fill the Working Hours  Properly ", "Invalid Input", MessageBoxButtons.OK, MessageBoxIcon.Warning)
        ElseIf Not IsNumeric(RegRate.Text) Then
            MessageBox.Show("Please Fill the Regular Rate Properly ", "Invalid Input", MessageBoxButtons.OK, MessageBoxIcon.Warning)
        ElseIf Not IsNumeric(OT.Text) Then
            MessageBox.Show("Please Fill the Overtime Properly ", "Invalid Input", MessageBoxButtons.OK, MessageBoxIcon.Warning)
        ElseIf Not IsNumeric(OTR.Text) Then
            MessageBox.Show("Please Fill the OvertimeRate Properly ", "Invalid Input", MessageBoxButtons.OK, MessageBoxIcon.Warning)

        Else

            neyms.Text = neym.Text
            Department.Text = Dep.Text
            WorkingHours.Text = WorkH.Text
            RegularRate.Text = RegRate.Text
            Overtime.Text = OT.Text
            OvertimeRate.Text = OTR.Text

            GrossSalary.Text = (Val(WorkH.Text) * Val(RegRate.Text) + Val(OT.Text) * Val(OTR.Text)).ToString("F2")
            Deduct.Text = "N/A"
            SSS.Text = (Val(GrossSalary.Text) * 0.06).ToString("F2")
            PagIbig.Text = (Val(GrossSalary.Text) * 0.09).ToString("F2")
            PhilHealth.Text = (Val(GrossSalary.Text) * 0.03).ToString("F2")
            IncomeTax.Text = (Val(GrossSalary.Text) * 0.08).ToString("F2")
            TD.Text = (Val(SSS.Text) + Val(PagIbig.Text) + Val(PhilHealth.Text) + Val(IncomeTax.Text)).ToString("F2")
            NetPay.Text = (Val(GrossSalary.Text) - Val(TD.Text)).ToString("F2")

        MessageBox.Show("Data submitted successfully!", "Success", MessageBoxButtons.OK, MessageBoxIcon.Information)
        End If


    End Sub
End Class
