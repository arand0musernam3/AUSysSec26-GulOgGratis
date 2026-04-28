package a60;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import java.io.EOFException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Enum[] f859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f860d;

    public f0(Class cls) {
        this.f857a = cls;
        try {
            Enum[] enumArr = (Enum[]) cls.getEnumConstants();
            this.f859c = enumArr;
            this.f858b = new String[enumArr.length];
            int i11 = 0;
            while (true) {
                Enum[] enumArr2 = this.f859c;
                if (i11 >= enumArr2.length) {
                    this.f860d = n.a(this.f858b);
                    return;
                }
                String strName = enumArr2[i11].name();
                String[] strArr = this.f858b;
                Field field = cls.getField(strName);
                Set set = b60.f.f6049a;
                i iVar = (i) field.getAnnotation(i.class);
                if (iVar != null) {
                    String strName2 = iVar.name();
                    if (!WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR.equals(strName2)) {
                        strName = strName2;
                    }
                }
                strArr[i11] = strName;
                i11++;
            }
        } catch (NoSuchFieldException e5) {
            throw new AssertionError("Missing field in ".concat(cls.getName()), e5);
        }
    }

    @Override // a60.k
    public final Object a(p pVar) throws EOFException, JsonEncodingException {
        int iU;
        int iP = pVar.f894g;
        if (iP == 0) {
            iP = pVar.p();
        }
        if (iP < 8 || iP > 11) {
            iU = -1;
        } else {
            n nVar = this.f860d;
            if (iP == 11) {
                iU = pVar.A(pVar.f897j, nVar);
            } else {
                iU = pVar.f892e.U(nVar.f885b);
                if (iU != -1) {
                    pVar.f894g = 0;
                    int[] iArr = pVar.f891d;
                    int i11 = pVar.f888a - 1;
                    iArr[i11] = iArr[i11] + 1;
                } else {
                    String strA0 = pVar.a0();
                    int iA = pVar.A(strA0, nVar);
                    if (iA == -1) {
                        pVar.f894g = 11;
                        pVar.f897j = strA0;
                        pVar.f891d[pVar.f888a - 1] = r0[r1] - 1;
                    }
                    iU = iA;
                }
            }
        }
        if (iU != -1) {
            return this.f859c[iU];
        }
        String strB = pVar.B();
        String strA02 = pVar.a0();
        throw new JsonDataException("Expected one of " + Arrays.asList(this.f858b) + " but was " + strA02 + " at path " + strB);
    }

    @Override // a60.k
    public final void e(q qVar, Object obj) {
        qVar.J(this.f858b[((Enum) obj).ordinal()]);
    }

    public final String toString() {
        return j4.s.h(this.f857a, new StringBuilder("JsonAdapter("), ")");
    }
}
