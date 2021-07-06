package pattern1.doc;

public class DocPackageByPatient implements DocPackage {

    @Override
    public DocPackage generateDocPackage() {
        return new DocPackageByPatient();
    }
}
