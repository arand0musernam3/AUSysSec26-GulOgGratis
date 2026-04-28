package y00;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o f45015f = new o((Boolean) null, 100, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f45018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumMap f45020e;

    public o(Boolean bool, int i11, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(a2.class);
        this.f45020e = enumMap;
        enumMap.put(a2.AD_USER_DATA, bool == null ? y1.UNINITIALIZED : bool.booleanValue() ? y1.GRANTED : y1.DENIED);
        this.f45016a = i11;
        this.f45017b = e();
        this.f45018c = bool2;
        this.f45019d = str;
    }

    public static o b(String str) {
        if (str == null || str.length() <= 0) {
            return f45015f;
        }
        String[] strArrSplit = str.split(":");
        int i11 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(a2.class);
        a2[] a2VarArrA = z1.DMA.a();
        int length = a2VarArrA.length;
        int i12 = 1;
        int i13 = 0;
        while (i13 < length) {
            enumMap.put(a2VarArrA[i13], b2.e(strArrSplit[i12].charAt(0)));
            i13++;
            i12++;
        }
        return new o(enumMap, i11, (Boolean) null, (String) null);
    }

    public static o c(int i11, Bundle bundle) {
        if (bundle == null) {
            return new o((Boolean) null, i11, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(a2.class);
        for (a2 a2Var : z1.DMA.a()) {
            enumMap.put(a2Var, b2.d(bundle.getString(a2Var.zze)));
        }
        return new o(enumMap, i11, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static Boolean d(Bundle bundle) {
        y1 y1VarD;
        if (bundle == null || (y1VarD = b2.d(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int iOrdinal = y1VarD.ordinal();
        if (iOrdinal == 2) {
            return Boolean.FALSE;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    public final y1 a() {
        y1 y1Var = (y1) this.f45020e.get(a2.AD_USER_DATA);
        return y1Var == null ? y1.UNINITIALIZED : y1Var;
    }

    public final String e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f45016a);
        for (a2 a2Var : z1.DMA.a()) {
            sb2.append(":");
            sb2.append(b2.h((y1) this.f45020e.get(a2Var)));
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f45017b.equalsIgnoreCase(oVar.f45017b) && Objects.equals(this.f45018c, oVar.f45018c)) {
            return Objects.equals(this.f45019d, oVar.f45019d);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.f45018c;
        int i11 = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.f45019d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.f45017b.hashCode() + (i11 * 29);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(b2.a(this.f45016a));
        for (a2 a2Var : z1.DMA.a()) {
            sb2.append(MessageLogView.COMMA_SEPARATOR);
            sb2.append(a2Var.zze);
            sb2.append("=");
            y1 y1Var = (y1) this.f45020e.get(a2Var);
            if (y1Var == null) {
                sb2.append("uninitialized");
            } else {
                int iOrdinal = y1Var.ordinal();
                if (iOrdinal == 0) {
                    sb2.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb2.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb2.append("denied");
                } else if (iOrdinal == 3) {
                    sb2.append("granted");
                }
            }
        }
        Boolean bool = this.f45018c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f45019d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    public o(EnumMap enumMap, int i11, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(a2.class);
        this.f45020e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f45016a = i11;
        this.f45017b = e();
        this.f45018c = bool;
        this.f45019d = str;
    }
}
