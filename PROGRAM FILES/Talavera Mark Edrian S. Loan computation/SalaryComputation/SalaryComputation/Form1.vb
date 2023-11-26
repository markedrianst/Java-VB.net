Imports System.Net

Public Class Form1
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        If String.IsNullOrEmpty(Name.Text) OrElse String.IsNullOrEmpty(Dep.Text) OrElse String.IsNullOrEmpty(WorkH.Text) OrElse String.IsNullOrEmpty(OT.Text) OrElse String.IsNullOrEmpty(OTR.Text) Then
            MessageBox.Show("You Don't Have To Clear", "Incomplete Information", MessageBoxButtons.OK, MessageBoxIcon.Warning)
        Else
            Dim result As DialogResult = MessageBox.Show("Are you sure You want to clear all fields?", "Confirmation", MessageBoxButtons.YesNo)
            If result = DialogResult.Yes Then
                Names.Text = ""
                Name.Text = ""
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

    End Sub
End Class
