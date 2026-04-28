package jg;

import android.text.Editable;
import android.text.TextWatcher;
import com.app.tgtg.customview.manufactureaddressfragment.AddressEditText;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f25241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f25242b;

    public z(a0 a0Var, Ref.BooleanRef booleanRef) {
        this.f25241a = a0Var;
        this.f25242b = booleanRef;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String strValueOf;
        int length;
        String string;
        String string2;
        CharSequence charSequenceSubSequence;
        boolean z11 = this.f25242b.element;
        a0 a0Var = this.f25241a;
        pg.r rVar = a0Var.f25145a;
        String str = a0Var.f25147c;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode == 2267) {
                if (str.equals("GB") && 5 <= (length = (strValueOf = String.valueOf(editable)).length()) && length < 9 && strValueOf.charAt(strValueOf.length() - 4) != ' ') {
                    String strN = kotlin.text.y.n(strValueOf, " ", "", false);
                    int length2 = strN.length() - 3;
                    String str2 = strN.substring(0, length2) + ' ' + strN.substring(length2);
                    rVar.C.setEtText(str2);
                    rVar.C.setSelection(str2.length());
                    return;
                }
                return;
            }
            if (iHashCode != 2556) {
                if (iHashCode != 2564 || !str.equals("PT")) {
                    return;
                }
            } else if (!str.equals("PL")) {
                return;
            }
            int i11 = Intrinsics.areEqual(str, "PL") ? 2 : 4;
            if (!z11) {
                if (String.valueOf(editable).length() != i11 || StringsKt.A(String.valueOf(editable), '-')) {
                    return;
                }
                if (editable != null) {
                    editable.append('-');
                }
                rVar.C.setEtText(String.valueOf(editable));
                AddressEditText addressEditText = rVar.C;
                editable.getClass();
                addressEditText.setSelection(editable.length());
                return;
            }
            if (String.valueOf(editable).length() == i11) {
                if (editable == null || (string2 = editable.toString()) == null) {
                    string = null;
                } else {
                    int i12 = i11 - 1;
                    if (i11 < i12) {
                        org.bouncycastle.jce.provider.a.v(r8.k.g(i11, i12, "End index (", ") is less than start index (", ")."));
                        return;
                    }
                    if (i11 == i12) {
                        charSequenceSubSequence = string2.subSequence(0, string2.length());
                    } else {
                        StringBuilder sb2 = new StringBuilder(string2.length() - (i11 - i12));
                        sb2.append((CharSequence) string2, 0, i12);
                        sb2.append((CharSequence) string2, i11, string2.length());
                        charSequenceSubSequence = sb2;
                    }
                    string = charSequenceSubSequence.toString();
                }
                rVar.C.setEtText(string);
                AddressEditText addressEditText2 = rVar.C;
                editable.getClass();
                addressEditText2.setSelection(editable.length() - 1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Map] */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTextChanged(java.lang.CharSequence r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.z.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }
}
