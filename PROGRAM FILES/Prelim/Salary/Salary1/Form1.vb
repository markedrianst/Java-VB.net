Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub TextBox1_TextChanged(sender As Object, e As EventArgs) Handles ngln.TextChanged

    End Sub

    Private Sub mainDept_TextChanged(sender As Object, e As EventArgs) Handles mainDept.TextChanged

    End Sub

    Private Sub mainWhour_TextChanged(sender As Object, e As EventArgs) Handles mainWhour.TextChanged

    End Sub

    Private Sub mainRrate_TextChanged(sender As Object, e As EventArgs) Handles mainRrate.TextChanged

    End Sub

    Private Sub mainTime_TextChanged(sender As Object, e As EventArgs) Handles mainTime.TextChanged

    End Sub

    Private Sub TextBox6_TextChanged(sender As Object, e As EventArgs) Handles mainOtime.TextChanged

    End Sub



    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Btn2.Click


        Dim name As String = Me.ngln.Text
        Dim dept As String = Me.mainDept.Text
        Dim works As Double = Double.Parse(mainWhour.Text)
        Dim reg_rate As Double = Double.Parse(mainRrate.Text)
        Dim oTime As Double = Double.Parse(mainOtime.Text)
        Dim oTime_rate As Double = Double.Parse(mainTime.Text)

        Dim monthly_salary As Double = works * reg_rate
        Dim overtime_salary As Double = oTime * oTime_rate
        Dim gross_salary As Double = monthly_salary + overtime_salary

        Dim sss As Double = 0.05
        Dim philhealth As Double = 0.035
        Dim pagibig As Double = 0.03
        Dim income_tax As Double = 0.08

        Dim sss_deduct As Double = gross_salary * sss
        Dim philhealth_deduct As Double = gross_salary * philhealth
        Dim pagibig_deduct As Double = gross_salary * pagibig
        Dim income_tax_deduct As Double = gross_salary * income_tax

        subN.Text = name
        subD.Text = dept
        subW.Text = works
        subR.Text = reg_rate
        subOt.Text = oTime
        subOtr.Text = oTime_rate
        grslry.Text = gross_salary.ToString()
        socials.Text = sss_deduct.ToString()
        pHilt.Text = philhealth_deduct.ToString()
        love.Text = pagibig_deduct.ToString()
        Itax.Text = income_tax_deduct.ToString()
        tDuck.Text = (sss_deduct + philhealth_deduct + pagibig_deduct + income_tax_deduct).ToString()

        Dim net_pay As Double = gross_salary - (sss_deduct + philhealth_deduct + pagibig_deduct + income_tax_deduct)
        nPay.Text = net_pay.ToString()




    End Sub


    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Btn1.Click
        ngln.Text = ""
        mainDept.Text = ""
        mainWhour.Text = ""
        mainRrate.Text = ""
        mainTime.Text = ""
        mainOtime.Text = ""
        subN.Text = ""
        subD.Text = ""
        subW.Text = ""
        subR.Text = ""
        subOt.Text = ""
        subOtr.Text = ""
        grslry.Text = ""
        socials.Text = ""
        pHilt.Text = ""
        love.Text = ""
        Itax.Text = ""
        tDuck.Text = ""
        nPay.Text = ""
        ngln.Text = ""
        mainDept.Text = ""
    End Sub



    Private Sub TextBox17_TextChanged(sender As Object, e As EventArgs) Handles love.TextChanged
        love.Enabled = False
    End Sub

    Private Sub TextBox20_TextChanged(sender As Object, e As EventArgs) Handles nPay.TextChanged
        nPay.Enabled = False
    End Sub

    Private Sub subN_TextChanged(sender As Object, e As EventArgs) Handles subN.TextChanged
        subN.Enabled = False
    End Sub

    Private Sub socials_TextChanged(sender As Object, e As EventArgs) Handles socials.TextChanged
        socials.Enabled = False
    End Sub

    Private Sub subR_TextChanged(sender As Object, e As EventArgs) Handles subR.TextChanged
        subR.Enabled = False
    End Sub

    Private Sub subOt_TextChanged(sender As Object, e As EventArgs) Handles subOt.TextChanged
        subOt.Enabled = False
    End Sub

    Private Sub subOtr_TextChanged(sender As Object, e As EventArgs) Handles subOtr.TextChanged
        subOtr.Enabled = False
    End Sub

    Private Sub tDuck_TextChanged(sender As Object, e As EventArgs) Handles tDuck.TextChanged
        tDuck.Enabled = False
    End Sub

    Private Sub subD_TextChanged(sender As Object, e As EventArgs) Handles subD.TextChanged
        subD.Enabled = False
    End Sub

    Private Sub subW_TextChanged(sender As Object, e As EventArgs) Handles subW.TextChanged
        subW.Enabled = False
    End Sub

    Private Sub grslry_TextChanged(sender As Object, e As EventArgs) Handles grslry.TextChanged
        grslry.Enabled = False
    End Sub

    Private Sub pHilt_TextChanged(sender As Object, e As EventArgs) Handles pHilt.TextChanged
        pHilt.Enabled = False
    End Sub

    Private Sub Itax_TextChanged(sender As Object, e As EventArgs) Handles Itax.TextChanged
        Itax.Enabled = False
    End Sub

    Private Sub Label22_Click(sender As Object, e As EventArgs) Handles Label22.Click

    End Sub
End Class




