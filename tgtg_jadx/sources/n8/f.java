package n8;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends w.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f30694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f30695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f30696e = true;

    public f(TextView textView) {
        this.f30694c = textView;
        this.f30695d = new d(textView);
    }

    @Override // w.b
    public final InputFilter[] J(InputFilter[] inputFilterArr) {
        if (!this.f30696e) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i11 = 0; i11 < inputFilterArr.length; i11++) {
                InputFilter inputFilter = inputFilterArr[i11];
                if (inputFilter instanceof d) {
                    sparseArray.put(i11, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i12 = 0;
            for (int i13 = 0; i13 < length; i13++) {
                if (sparseArray.indexOfKey(i13) < 0) {
                    inputFilterArr2[i12] = inputFilterArr[i13];
                    i12++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i14 = 0;
        while (true) {
            d dVar = this.f30695d;
            if (i14 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i14] == dVar) {
                return inputFilterArr;
            }
            i14++;
        }
    }

    @Override // w.b
    public final boolean S() {
        return this.f30696e;
    }

    @Override // w.b
    public final void Z(boolean z11) {
        if (z11) {
            TextView textView = this.f30694c;
            textView.setTransformationMethod(e0(textView.getTransformationMethod()));
        }
    }

    @Override // w.b
    public final void c0(boolean z11) {
        this.f30696e = z11;
        TextView textView = this.f30694c;
        textView.setTransformationMethod(e0(textView.getTransformationMethod()));
        textView.setFilters(J(textView.getFilters()));
    }

    @Override // w.b
    public final TransformationMethod e0(TransformationMethod transformationMethod) {
        return this.f30696e ? ((transformationMethod instanceof j) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new j(transformationMethod) : transformationMethod instanceof j ? ((j) transformationMethod).f30702a : transformationMethod;
    }
}
