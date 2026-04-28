package g9;

import android.net.Uri;
import android.os.Bundle;
import com.adyen.checkout.components.core.Address;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.CharsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends q0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f20112r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(boolean z11, int i11) {
        super(z11);
        this.f20112r = i11;
    }

    @Override // g9.q0
    public final Object a(Bundle bundle, String str) {
        switch (this.f20112r) {
            case 0:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || w.b.T(bundle, str)) {
                    return null;
                }
                boolean z11 = bundle.getBoolean(str, false);
                if (z11 || !bundle.getBoolean(str, true)) {
                    return Boolean.valueOf(z11);
                }
                w0.e.D(str);
                throw null;
            case 1:
                bundle.getClass();
                str.getClass();
                float f11 = bundle.getFloat(str, Float.MIN_VALUE);
                if (f11 != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
                    return Float.valueOf(f11);
                }
                w0.e.D(str);
                throw null;
            case 2:
                bundle.getClass();
                str.getClass();
                return Integer.valueOf(w.b.K(bundle, str));
            case 3:
                bundle.getClass();
                str.getClass();
                long j9 = bundle.getLong(str, Long.MIN_VALUE);
                if (j9 != Long.MIN_VALUE || bundle.getLong(str, LongCompanionObject.MAX_VALUE) != LongCompanionObject.MAX_VALUE) {
                    return Long.valueOf(j9);
                }
                w0.e.D(str);
                throw null;
            case 4:
                bundle.getClass();
                str.getClass();
                return Integer.valueOf(w.b.K(bundle, str));
            default:
                bundle.getClass();
                str.getClass();
                if (!w.b.A(bundle, str) || w.b.T(bundle, str)) {
                    return null;
                }
                return w.b.N(bundle, str);
        }
    }

    @Override // g9.q0
    public final String b() {
        switch (this.f20112r) {
            case 0:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case 3:
                return "long";
            case 4:
                return "reference";
            default:
                return "string";
        }
    }

    @Override // g9.q0
    public final Object d(String str) {
        boolean z11;
        switch (this.f20112r) {
            case 0:
                str.getClass();
                if (Intrinsics.areEqual(str, "true")) {
                    z11 = true;
                } else {
                    if (!Intrinsics.areEqual(str, "false")) {
                        i4.a.f("A boolean NavType only accepts \"true\" or \"false\" values.");
                        return null;
                    }
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case 1:
                str.getClass();
                return Float.valueOf(Float.parseFloat(str));
            case 2:
                str.getClass();
                return Integer.valueOf(kotlin.text.y.p(str, "0x", false) ? Integer.parseInt(str.substring(2), CharsKt.checkRadix(16)) : Integer.parseInt(str));
            case 3:
                str.getClass();
                String strSubstring = kotlin.text.y.j(str, "L", false) ? str.substring(0, str.length() - 1) : str;
                return Long.valueOf(kotlin.text.y.p(str, "0x", false) ? Long.parseLong(strSubstring.substring(2), CharsKt.checkRadix(16)) : Long.parseLong(strSubstring));
            case 4:
                str.getClass();
                return Integer.valueOf(kotlin.text.y.p(str, "0x", false) ? Integer.parseInt(str.substring(2), CharsKt.checkRadix(16)) : Integer.parseInt(str));
            default:
                str.getClass();
                if (Intrinsics.areEqual(str, Address.ADDRESS_NULL_PLACEHOLDER)) {
                    return null;
                }
                return str;
        }
    }

    @Override // g9.q0
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f20112r) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                str.getClass();
                bundle.putBoolean(str, zBooleanValue);
                break;
            case 1:
                float fFloatValue = ((Number) obj).floatValue();
                str.getClass();
                bundle.putFloat(str, fFloatValue);
                break;
            case 2:
                int iIntValue = ((Number) obj).intValue();
                str.getClass();
                bundle.putInt(str, iIntValue);
                break;
            case 3:
                long jLongValue = ((Number) obj).longValue();
                str.getClass();
                bundle.putLong(str, jLongValue);
                break;
            case 4:
                int iIntValue2 = ((Number) obj).intValue();
                str.getClass();
                bundle.putInt(str, iIntValue2);
                break;
            default:
                String str2 = (String) obj;
                str.getClass();
                if (str2 == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putString(str, str2);
                }
                break;
        }
    }

    @Override // g9.q0
    public String f(Object obj) {
        switch (this.f20112r) {
            case 5:
                String str = (String) obj;
                if (str == null) {
                    return Address.ADDRESS_NULL_PLACEHOLDER;
                }
                String strEncode = Uri.encode(str, null);
                strEncode.getClass();
                return strEncode;
            default:
                return super.f(obj);
        }
    }
}
