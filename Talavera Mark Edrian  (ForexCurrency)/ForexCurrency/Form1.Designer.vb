<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()>
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Form1))
        Me.Panel1 = New System.Windows.Forms.Panel()
        Me.transparent = New System.Windows.Forms.Panel()
        Me.PictureBox2 = New System.Windows.Forms.PictureBox()
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.Selection1 = New System.Windows.Forms.ComboBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Selection2 = New System.Windows.Forms.ComboBox()
        Me.ConvertedAmount = New System.Windows.Forms.TextBox()
        Me.Button4 = New System.Windows.Forms.Button()
        Me.Button5 = New System.Windows.Forms.Button()
        Me.input = New System.Windows.Forms.TextBox()
        Me.Panel2 = New System.Windows.Forms.Panel()
        Me.PictureBox3 = New System.Windows.Forms.PictureBox()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Close1 = New System.Windows.Forms.Button()
        Me.Button2 = New System.Windows.Forms.Button()
        Me.Minimize = New System.Windows.Forms.Button()
        Me.Panel1.SuspendLayout()
        Me.transparent.SuspendLayout()
        CType(Me.PictureBox2, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.Panel2.SuspendLayout()
        CType(Me.PictureBox3, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'Panel1
        '
        Me.Panel1.BackgroundImage = CType(resources.GetObject("Panel1.BackgroundImage"), System.Drawing.Image)
        Me.Panel1.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.Panel1.Controls.Add(Me.transparent)
        Me.Panel1.Controls.Add(Me.Panel2)
        Me.Panel1.Location = New System.Drawing.Point(0, 0)
        Me.Panel1.Name = "Panel1"
        Me.Panel1.Size = New System.Drawing.Size(653, 475)
        Me.Panel1.TabIndex = 0
        '
        'transparent
        '
        Me.transparent.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.transparent.Controls.Add(Me.PictureBox2)
        Me.transparent.Controls.Add(Me.PictureBox1)
        Me.transparent.Controls.Add(Me.Selection1)
        Me.transparent.Controls.Add(Me.Label1)
        Me.transparent.Controls.Add(Me.Selection2)
        Me.transparent.Controls.Add(Me.ConvertedAmount)
        Me.transparent.Controls.Add(Me.Button4)
        Me.transparent.Controls.Add(Me.Button5)
        Me.transparent.Controls.Add(Me.input)
        Me.transparent.Location = New System.Drawing.Point(37, 51)
        Me.transparent.Name = "transparent"
        Me.transparent.Size = New System.Drawing.Size(585, 393)
        Me.transparent.TabIndex = 11
        '
        'PictureBox2
        '
        Me.PictureBox2.BackColor = System.Drawing.Color.Transparent
        Me.PictureBox2.Image = Global.ForexCurrency.My.Resources.Resources.preload__2___1_
        Me.PictureBox2.Location = New System.Drawing.Point(310, 101)
        Me.PictureBox2.Name = "PictureBox2"
        Me.PictureBox2.Size = New System.Drawing.Size(253, 174)
        Me.PictureBox2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox2.TabIndex = 12
        Me.PictureBox2.TabStop = False
        '
        'PictureBox1
        '
        Me.PictureBox1.BackColor = System.Drawing.Color.Transparent
        Me.PictureBox1.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Center
        Me.PictureBox1.Image = Global.ForexCurrency.My.Resources.Resources.preload__2___1_
        Me.PictureBox1.Location = New System.Drawing.Point(14, 101)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(253, 174)
        Me.PictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox1.TabIndex = 11
        Me.PictureBox1.TabStop = False
        '
        'Selection1
        '
        Me.Selection1.BackColor = System.Drawing.SystemColors.ActiveBorder
        Me.Selection1.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList
        Me.Selection1.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Selection1.Font = New System.Drawing.Font("Microsoft Sans Serif", 15.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Selection1.Items.AddRange(New Object() {"US DOLLAR", "HKG DOLLAR", "CND DOLLAR", "IND RUPEE", "SRL RUPEE", "UAE DINAR", "PHP PESO", "UK POUND", "JPN YEN", "EURO"})
        Me.Selection1.Location = New System.Drawing.Point(14, 62)
        Me.Selection1.Name = "Selection1"
        Me.Selection1.Size = New System.Drawing.Size(253, 33)
        Me.Selection1.TabIndex = 3
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.BackColor = System.Drawing.Color.Transparent
        Me.Label1.Font = New System.Drawing.Font("Lucida Fax", 27.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.ForeColor = System.Drawing.Color.WhiteSmoke
        Me.Label1.Location = New System.Drawing.Point(112, 16)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(373, 43)
        Me.Label1.TabIndex = 10
        Me.Label1.Text = "FOREX CURRENCY"
        '
        'Selection2
        '
        Me.Selection2.BackColor = System.Drawing.SystemColors.ActiveBorder
        Me.Selection2.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList
        Me.Selection2.Enabled = False
        Me.Selection2.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Selection2.Font = New System.Drawing.Font("Microsoft Sans Serif", 15.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Selection2.FormattingEnabled = True
        Me.Selection2.Items.AddRange(New Object() {"US DOLLAR", "HKG DOLLAR", "CND DOLLAR", "IND RUPEE", "SRL RUPEE", "UAE DINAR", "PHP PESO", "UK POUND", "JPN YEN", "EURO"})
        Me.Selection2.Location = New System.Drawing.Point(310, 62)
        Me.Selection2.Name = "Selection2"
        Me.Selection2.Size = New System.Drawing.Size(253, 33)
        Me.Selection2.TabIndex = 4
        '
        'ConvertedAmount
        '
        Me.ConvertedAmount.BackColor = System.Drawing.Color.BlanchedAlmond
        Me.ConvertedAmount.BorderStyle = System.Windows.Forms.BorderStyle.None
        Me.ConvertedAmount.Font = New System.Drawing.Font("Times New Roman", 15.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.ConvertedAmount.Location = New System.Drawing.Point(357, 281)
        Me.ConvertedAmount.Name = "ConvertedAmount"
        Me.ConvertedAmount.ReadOnly = True
        Me.ConvertedAmount.Size = New System.Drawing.Size(157, 25)
        Me.ConvertedAmount.TabIndex = 6
        Me.ConvertedAmount.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'Button4
        '
        Me.Button4.BackColor = System.Drawing.Color.RosyBrown
        Me.Button4.FlatAppearance.BorderColor = System.Drawing.Color.Silver
        Me.Button4.FlatAppearance.MouseDownBackColor = System.Drawing.Color.RosyBrown
        Me.Button4.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(128, Byte), Integer), CType(CType(128, Byte), Integer))
        Me.Button4.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Button4.Font = New System.Drawing.Font("Lucida Fax", 14.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Button4.Location = New System.Drawing.Point(81, 312)
        Me.Button4.Name = "Button4"
        Me.Button4.Size = New System.Drawing.Size(116, 53)
        Me.Button4.TabIndex = 7
        Me.Button4.Text = "Clear "
        Me.Button4.UseVisualStyleBackColor = False
        '
        'Button5
        '
        Me.Button5.BackColor = System.Drawing.Color.YellowGreen
        Me.Button5.FlatAppearance.BorderColor = System.Drawing.Color.Silver
        Me.Button5.FlatAppearance.MouseDownBackColor = System.Drawing.Color.DarkSeaGreen
        Me.Button5.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(CType(CType(128, Byte), Integer), CType(CType(255, Byte), Integer), CType(CType(128, Byte), Integer))
        Me.Button5.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Button5.Font = New System.Drawing.Font("Lucida Fax", 14.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Button5.Location = New System.Drawing.Point(378, 312)
        Me.Button5.Name = "Button5"
        Me.Button5.Size = New System.Drawing.Size(116, 53)
        Me.Button5.TabIndex = 8
        Me.Button5.Text = "Compute "
        Me.Button5.UseVisualStyleBackColor = False
        '
        'input
        '
        Me.input.BackColor = System.Drawing.Color.BlanchedAlmond
        Me.input.BorderStyle = System.Windows.Forms.BorderStyle.None
        Me.input.Font = New System.Drawing.Font("Times New Roman", 15.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.input.Location = New System.Drawing.Point(58, 281)
        Me.input.Name = "input"
        Me.input.Size = New System.Drawing.Size(157, 25)
        Me.input.TabIndex = 5
        Me.input.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'Panel2
        '
        Me.Panel2.BackColor = System.Drawing.Color.DarkSlateGray
        Me.Panel2.Controls.Add(Me.PictureBox3)
        Me.Panel2.Controls.Add(Me.Label2)
        Me.Panel2.Controls.Add(Me.Close1)
        Me.Panel2.Controls.Add(Me.Button2)
        Me.Panel2.Controls.Add(Me.Minimize)
        Me.Panel2.Location = New System.Drawing.Point(-10, 0)
        Me.Panel2.Name = "Panel2"
        Me.Panel2.Size = New System.Drawing.Size(697, 32)
        Me.Panel2.TabIndex = 9
        '
        'PictureBox3
        '
        Me.PictureBox3.Image = Global.ForexCurrency.My.Resources.Resources.download
        Me.PictureBox3.Location = New System.Drawing.Point(13, 3)
        Me.PictureBox3.Name = "PictureBox3"
        Me.PictureBox3.Size = New System.Drawing.Size(25, 24)
        Me.PictureBox3.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox3.TabIndex = 12
        Me.PictureBox3.TabStop = False
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.BackColor = System.Drawing.Color.Transparent
        Me.Label2.Font = New System.Drawing.Font("Arial", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label2.ForeColor = System.Drawing.Color.WhiteSmoke
        Me.Label2.Location = New System.Drawing.Point(44, 8)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(150, 18)
        Me.Label2.TabIndex = 13
        Me.Label2.Text = "FOREX CURRENCY"
        '
        'Close1
        '
        Me.Close1.BackColor = System.Drawing.Color.Transparent
        Me.Close1.FlatAppearance.BorderColor = System.Drawing.Color.Gray
        Me.Close1.FlatAppearance.MouseDownBackColor = System.Drawing.Color.Red
        Me.Close1.FlatAppearance.MouseOverBackColor = System.Drawing.Color.Red
        Me.Close1.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Close1.Font = New System.Drawing.Font("Gill Sans Ultra Bold", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Close1.ForeColor = System.Drawing.Color.Maroon
        Me.Close1.Location = New System.Drawing.Point(618, 3)
        Me.Close1.Name = "Close1"
        Me.Close1.Size = New System.Drawing.Size(27, 23)
        Me.Close1.TabIndex = 0
        Me.Close1.Text = "X"
        Me.Close1.UseVisualStyleBackColor = False
        '
        'Button2
        '
        Me.Button2.BackColor = System.Drawing.Color.Transparent
        Me.Button2.FlatAppearance.BorderColor = System.Drawing.Color.Gray
        Me.Button2.FlatAppearance.MouseDownBackColor = System.Drawing.Color.LightGray
        Me.Button2.FlatAppearance.MouseOverBackColor = System.Drawing.Color.Silver
        Me.Button2.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Button2.Font = New System.Drawing.Font("Gill Sans Ultra Bold", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Button2.ForeColor = System.Drawing.Color.Transparent
        Me.Button2.Location = New System.Drawing.Point(584, 3)
        Me.Button2.Name = "Button2"
        Me.Button2.Size = New System.Drawing.Size(27, 23)
        Me.Button2.TabIndex = 1
        Me.Button2.Text = "🗖"
        Me.Button2.UseVisualStyleBackColor = False
        '
        'Minimize
        '
        Me.Minimize.BackColor = System.Drawing.Color.Transparent
        Me.Minimize.FlatAppearance.BorderColor = System.Drawing.Color.Gray
        Me.Minimize.FlatAppearance.MouseDownBackColor = System.Drawing.Color.LightGray
        Me.Minimize.FlatAppearance.MouseOverBackColor = System.Drawing.Color.Silver
        Me.Minimize.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Minimize.Font = New System.Drawing.Font("Gill Sans Ultra Bold", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Minimize.ForeColor = System.Drawing.Color.Transparent
        Me.Minimize.Location = New System.Drawing.Point(551, 3)
        Me.Minimize.Name = "Minimize"
        Me.Minimize.Size = New System.Drawing.Size(27, 23)
        Me.Minimize.TabIndex = 2
        Me.Minimize.Text = "-"
        Me.Minimize.UseVisualStyleBackColor = False
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Center
        Me.ClientSize = New System.Drawing.Size(647, 472)
        Me.Controls.Add(Me.Panel1)
        Me.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.Name = "Form1"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Form1"
        Me.Panel1.ResumeLayout(False)
        Me.transparent.ResumeLayout(False)
        Me.transparent.PerformLayout()
        CType(Me.PictureBox2, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.Panel2.ResumeLayout(False)
        Me.Panel2.PerformLayout()
        CType(Me.PictureBox3, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub

    Friend WithEvents Panel1 As Panel
    Friend WithEvents Close1 As Button
    Friend WithEvents Minimize As Button
    Friend WithEvents input As TextBox
    Friend WithEvents Selection1 As ComboBox
    Friend WithEvents Button5 As Button
    Friend WithEvents Button4 As Button
    Friend WithEvents ConvertedAmount As TextBox
    Friend WithEvents Panel2 As Panel
    Friend WithEvents Button2 As Button
    Friend WithEvents Label1 As Label
    Friend WithEvents Selection2 As ComboBox
    Friend WithEvents transparent As Panel
    Friend WithEvents PictureBox2 As PictureBox
    Friend WithEvents Label2 As Label
    Friend WithEvents PictureBox1 As PictureBox
    Friend WithEvents PictureBox3 As PictureBox
End Class
