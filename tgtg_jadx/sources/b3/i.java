package b3;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.EditText;
import androidx.lifecycle.l1;
import androidx.lifecycle.r1;
import androidx.lifecycle.s1;
import com.adyen.checkout.components.core.internal.ui.model.Validation;
import com.adyen.checkout.components.core.internal.util.ViewModelExtKt;
import com.adyen.checkout.ui.core.internal.util.ViewExtensionsKt;
import com.google.android.gms.internal.measurement.b1;
import com.google.android.gms.internal.measurement.fa;
import com.google.android.gms.internal.measurement.l5;
import com.google.android.gms.internal.measurement.t1;
import com.google.android.material.textfield.TextInputLayout;
import d2.m2;
import d2.n1;
import d2.w0;
import d2.w2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import m3.d3;
import m3.e0;
import m3.v1;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static /* synthetic */ void A(Object obj) {
        if (obj == null) {
            return;
        }
        org.bouncycastle.jce.provider.a.c();
    }

    public static void B(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
    }

    public static void C(StringBuilder sb2, boolean z11, String str, boolean z12, String str2) {
        sb2.append(z11);
        sb2.append(str);
        sb2.append(z12);
        sb2.append(str2);
    }

    public static KotlinNothingValueException D(String str) {
        y4.a.c(str);
        return new KotlinNothingValueException();
    }

    public static int a(int i11, int i12, int i13) {
        return b1.a(i11) + i12 + i13;
    }

    public static int b(int i11, int i12, int i13, int i14) {
        return b1.a(i11) + i12 + i13 + i14;
    }

    public static int c(Parcelable.Creator creator, Parcel parcel, ArrayList arrayList, int i11, int i12) {
        arrayList.add(creator.createFromParcel(parcel));
        return i11 + i12;
    }

    public static l1 d(s1 s1Var, androidx.lifecycle.a aVar, String str, Class cls) {
        return ViewModelExtKt.get(new r1(s1Var, aVar), str, cls);
    }

    public static b4.t e(float f11, b4.t tVar, boolean z11) {
        return tVar.then(new n1(f11, z11));
    }

    public static b4.t f(b4.i iVar, b4.t tVar) {
        return tVar.then(new w0(iVar));
    }

    public static b4.t g(b4.j jVar, b4.t tVar) {
        return tVar.then(new w2(jVar));
    }

    public static t1 h(t1 t1Var) {
        int size = t1Var.size();
        return t1Var.k(size + size);
    }

    public static Object i(l5 l5Var, int i11, ArrayList arrayList, int i12) {
        fa.c(l5Var.name(), arrayList, i11);
        return arrayList.get(i12);
    }

    public static String j(int i11, int i12, m3.s sVar, m3.s sVar2, boolean z11) {
        sVar.a0(i11);
        String strU = f0.U(sVar2, i12);
        sVar.q(z11);
        return strU;
    }

    public static String k(String str, IOException iOException) {
        return str + iOException;
    }

    public static String l(String str, Exception exc) {
        return str + exc;
    }

    public static String m(StringBuilder sb2, Integer num, String str) {
        sb2.append(num);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder n(long j9, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(j9);
        return sb2;
    }

    public static StringBuilder o(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static StringBuilder p(String str, boolean z11, String str2, boolean z12, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(z11);
        sb2.append(str2);
        sb2.append(z12);
        sb2.append(str3);
        return sb2;
    }

    public static Iterator q(Parcel parcel, int i11, List list) {
        parcel.writeInt(i11);
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static Iterator r(List list, Parcel parcel) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static KotlinNothingValueException s(String str) {
        b6.b.b(str);
        return new KotlinNothingValueException();
    }

    public static v1 t(float f11, float f12, d3 d3Var) {
        return d3Var.a(new z5.d(f11, f12));
    }

    public static v1 u(long j9, e0 e0Var) {
        return e0Var.a(new i4.v(j9));
    }

    public static void v(Parcel parcel, int i11, Boolean bool) {
        parcel.writeInt(i11);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void w(Parcel parcel, int i11, Integer num) {
        parcel.writeInt(i11);
        parcel.writeInt(num.intValue());
    }

    public static void x(EditText editText, int i11, boolean z11, boolean z12) {
        editText.setVisibility(i11);
        editText.setFocusable(z11);
        editText.setFocusableInTouchMode(z12);
    }

    public static void y(b4.q qVar, float f11, m3.s sVar, boolean z11) {
        d2.c.f(m2.m(qVar, f11), sVar);
        sVar.q(z11);
    }

    public static void z(Validation.Invalid invalid, Context context, TextInputLayout textInputLayout) {
        String string = context.getString(invalid.getReason());
        string.getClass();
        ViewExtensionsKt.showError(textInputLayout, string);
    }
}
