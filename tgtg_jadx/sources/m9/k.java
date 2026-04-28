package m9;

import android.net.Uri;
import android.os.Bundle;
import com.adyen.checkout.components.core.Address;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import g9.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends q0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final k f29752s = new k(false, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f29753r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(boolean z11, int i11) {
        super(z11);
        this.f29753r = i11;
    }

    @Override // g9.q0
    public final Object a(Bundle bundle, String str) {
        switch (this.f29753r) {
            case 0:
                bundle.getClass();
                str.getClass();
                return null;
            case 1:
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
            case 2:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || w.b.T(bundle, str)) {
                    return null;
                }
                double d3 = bundle.getDouble(str, Double.MIN_VALUE);
                if (d3 != Double.MIN_VALUE || bundle.getDouble(str, Double.MAX_VALUE) != Double.MAX_VALUE) {
                    return Double.valueOf(d3);
                }
                w0.e.D(str);
                throw null;
            case 3:
                bundle.getClass();
                str.getClass();
                double d11 = bundle.getDouble(str, Double.MIN_VALUE);
                if (d11 != Double.MIN_VALUE || bundle.getDouble(str, Double.MAX_VALUE) != Double.MAX_VALUE) {
                    return Double.valueOf(d11);
                }
                w0.e.D(str);
                throw null;
            case 4:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || w.b.T(bundle, str)) {
                    return null;
                }
                float f11 = bundle.getFloat(str, Float.MIN_VALUE);
                if (f11 != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
                    return Float.valueOf(f11);
                }
                w0.e.D(str);
                throw null;
            case 5:
                bundle.getClass();
                str.getClass();
                if (!w.b.A(bundle, str) || w.b.T(bundle, str)) {
                    return null;
                }
                return Integer.valueOf(w.b.K(bundle, str));
            case 6:
                bundle.getClass();
                str.getClass();
                if (!bundle.containsKey(str) || w.b.T(bundle, str)) {
                    return null;
                }
                long j9 = bundle.getLong(str, Long.MIN_VALUE);
                if (j9 != Long.MIN_VALUE || bundle.getLong(str, LongCompanionObject.MAX_VALUE) != LongCompanionObject.MAX_VALUE) {
                    return Long.valueOf(j9);
                }
                w0.e.D(str);
                throw null;
            default:
                bundle.getClass();
                str.getClass();
                return (!w.b.A(bundle, str) || w.b.T(bundle, str)) ? Address.ADDRESS_NULL_PLACEHOLDER : w.b.N(bundle, str);
        }
    }

    @Override // g9.q0
    public final String b() {
        switch (this.f29753r) {
            case 0:
                return PaymentMethodTypes.UNKNOWN;
            case 1:
                return "boolean_nullable";
            case 2:
                return "double_nullable";
            case 3:
                return "double";
            case 4:
                return "float_nullable";
            case 5:
                return "integer_nullable";
            case 6:
                return "long_nullable";
            default:
                return "string_non_nullable";
        }
    }

    @Override // g9.q0
    public final Object d(String str) {
        switch (this.f29753r) {
            case 0:
                str.getClass();
                return Address.ADDRESS_NULL_PLACEHOLDER;
            case 1:
                str.getClass();
                if (Intrinsics.areEqual(str, Address.ADDRESS_NULL_PLACEHOLDER)) {
                    return null;
                }
                return (Boolean) q0.l.d(str);
            case 2:
                str.getClass();
                if (Intrinsics.areEqual(str, Address.ADDRESS_NULL_PLACEHOLDER)) {
                    return null;
                }
                return Double.valueOf(Double.parseDouble(str));
            case 3:
                str.getClass();
                return Double.valueOf(Double.parseDouble(str));
            case 4:
                str.getClass();
                if (Intrinsics.areEqual(str, Address.ADDRESS_NULL_PLACEHOLDER)) {
                    return null;
                }
                return Float.valueOf(Float.parseFloat(str));
            case 5:
                str.getClass();
                if (Intrinsics.areEqual(str, Address.ADDRESS_NULL_PLACEHOLDER)) {
                    return null;
                }
                return (Integer) q0.f20196b.d(str);
            case 6:
                str.getClass();
                if (Intrinsics.areEqual(str, Address.ADDRESS_NULL_PLACEHOLDER)) {
                    return null;
                }
                return (Long) q0.f20200f.d(str);
            default:
                str.getClass();
                return str;
        }
    }

    @Override // g9.q0
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f29753r) {
            case 0:
                str.getClass();
                ((String) obj).getClass();
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                str.getClass();
                if (bool != null) {
                    q0.l.e(bundle, str, bool);
                } else {
                    bundle.putString(str, null);
                }
                break;
            case 2:
                Double d3 = (Double) obj;
                str.getClass();
                if (d3 != null) {
                    bundle.putDouble(str, d3.doubleValue());
                } else {
                    bundle.putString(str, null);
                }
                break;
            case 3:
                double dDoubleValue = ((Number) obj).doubleValue();
                str.getClass();
                bundle.putDouble(str, dDoubleValue);
                break;
            case 4:
                Float f11 = (Float) obj;
                str.getClass();
                if (f11 != null) {
                    q0.f20203i.e(bundle, str, f11);
                } else {
                    bundle.putString(str, null);
                }
                break;
            case 5:
                Integer num = (Integer) obj;
                str.getClass();
                if (num != null) {
                    q0.f20196b.e(bundle, str, num);
                } else {
                    bundle.putString(str, null);
                }
                break;
            case 6:
                Long l = (Long) obj;
                str.getClass();
                if (l != null) {
                    q0.f20200f.e(bundle, str, l);
                } else {
                    bundle.putString(str, null);
                }
                break;
            default:
                String str2 = (String) obj;
                str.getClass();
                str2.getClass();
                bundle.putString(str, str2);
                break;
        }
    }

    @Override // g9.q0
    public String f(Object obj) {
        switch (this.f29753r) {
            case 7:
                String str = (String) obj;
                str.getClass();
                String strEncode = Uri.encode(str, null);
                strEncode.getClass();
                return strEncode;
            default:
                return super.f(obj);
        }
    }
}
