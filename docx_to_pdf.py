from docx2pdf import convert

src = r"s:\Automated CICD Pipeline\SYNOPSIS.docx"
dst = r"s:\Automated CICD Pipeline\SYNOPSIS.pdf"

try:
    convert(src, dst)
    print(f"Converted to PDF: {dst}")
except Exception as e:
    print("Conversion failed:", e)
