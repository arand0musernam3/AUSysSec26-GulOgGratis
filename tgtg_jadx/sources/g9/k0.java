package g9;

import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {
    public static q0 a(String str, String str2) {
        boolean zAreEqual = Intrinsics.areEqual("integer", str);
        d dVar = q0.f20208o;
        q0 q0Var = zAreEqual ? q0.f20196b : Intrinsics.areEqual("integer[]", str) ? q0.f20198d : Intrinsics.areEqual("List<Int>", str) ? q0.f20199e : Intrinsics.areEqual("long", str) ? q0.f20200f : Intrinsics.areEqual("long[]", str) ? q0.f20201g : Intrinsics.areEqual("List<Long>", str) ? q0.f20202h : Intrinsics.areEqual("boolean", str) ? q0.l : Intrinsics.areEqual("boolean[]", str) ? q0.f20206m : Intrinsics.areEqual("List<Boolean>", str) ? q0.f20207n : Intrinsics.areEqual("string", str) ? dVar : Intrinsics.areEqual("string[]", str) ? q0.f20209p : Intrinsics.areEqual("List<String>", str) ? q0.f20210q : Intrinsics.areEqual("float", str) ? q0.f20203i : Intrinsics.areEqual("float[]", str) ? q0.f20204j : Intrinsics.areEqual("List<Float>", str) ? q0.f20205k : null;
        if (q0Var != null) {
            return q0Var;
        }
        if (Intrinsics.areEqual("reference", str)) {
            return q0.f20197c;
        }
        if (str.length() == 0) {
            return dVar;
        }
        try {
            String strConcat = (!kotlin.text.y.p(str, ".", false) || str2 == null) ? str : str2.concat(str);
            boolean zJ = kotlin.text.y.j(str, "[]", false);
            if (zJ) {
                strConcat = strConcat.substring(0, strConcat.length() - 2);
            }
            q0 q0VarB = b(Class.forName(strConcat), zJ);
            if (q0VarB != null) {
                return q0VarB;
            }
            throw new IllegalArgumentException(strConcat.concat(" is not Serializable or Parcelable.").toString());
        } catch (ClassNotFoundException e5) {
            org.bouncycastle.jce.provider.a.m(e5);
            return null;
        }
    }

    public static q0 b(Class cls, boolean z11) {
        if (Parcelable.class.isAssignableFrom(cls)) {
            return z11 ? new m0(cls) : new n0(cls);
        }
        if (Enum.class.isAssignableFrom(cls) && !z11) {
            return new l0(cls);
        }
        if (Serializable.class.isAssignableFrom(cls)) {
            return z11 ? new o0(cls) : new p0(cls);
        }
        return null;
    }
}
