package a40;

import b5.m0;
import com.app.tgtg.model.remote.AppSettings;
import com.app.tgtg.model.remote.Country;
import com.braze.models.cards.Card;
import com.braze.ui.contentcards.BrazeContentCardUtils;
import d40.f0;
import d40.q1;
import h2.r0;
import h2.s1;
import java.io.File;
import java.util.Comparator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f727a;

    public /* synthetic */ i(int i11) {
        this.f727a = i11;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f727a) {
            case 0:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 1:
                return ((f0) ((q1) obj)).f14153a.compareTo(((f0) ((q1) obj2)).f14153a);
            case 2:
                m0 m0Var = (m0) obj;
                m0 m0Var2 = (m0) obj2;
                float f11 = m0Var.H.f5942p.F;
                float f12 = m0Var2.H.f5942p.F;
                return f11 == f12 ? Intrinsics.compare(m0Var.x(), m0Var2.x()) : Float.compare(f11, f12);
            case 3:
                return BrazeContentCardUtils.defaultCardHandling$lambda$0((Card) obj, (Card) obj2);
            case 4:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i11 = 0; i11 < bArr.length; i11++) {
                    byte b8 = bArr[i11];
                    byte b11 = bArr2[i11];
                    if (b8 != b11) {
                        return b8 - b11;
                    }
                }
                return 0;
            case 5:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 6:
                String name = ((File) obj).getName();
                int i12 = g40.a.f19992f;
                return name.substring(0, i12).compareTo(((File) obj2).getName().substring(0, i12));
            case 7:
                return Intrinsics.compare(((s1) obj2).f21217a, ((s1) obj).f21217a);
            case 8:
                return Intrinsics.compare(((r0) obj).getIndex(), ((r0) obj2).getIndex());
            case 9:
                return Intrinsics.compare(((m3.r0) obj).f29408b, ((m3.r0) obj2).f29408b);
            case 10:
                return Integer.parseInt(((String) obj).split(":")[0]) - Integer.parseInt(((String) obj2).split(":")[0]);
            case 11:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                return (((Number) pair.f26486b).intValue() - ((Number) pair.f26485a).intValue()) - (((Number) pair2.f26486b).intValue() - ((Number) pair2.f26485a).intValue());
            case 12:
                return com.braze.triggers.utils.b.a((com.braze.triggers.actions.a) obj, (com.braze.triggers.actions.a) obj2);
            case 13:
                return ((s0.g) obj).f38329a.compareTo(((s0.g) obj2).f38329a);
            case 14:
                return AppSettings.getSortedCountries$lambda$0((Country) obj, (Country) obj2);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                vx.d dVar = (vx.d) obj;
                vx.d dVar2 = (vx.d) obj2;
                if (yx.a.f46339a.contains(wx.c.class)) {
                    return 0;
                }
                try {
                    dVar2.getClass();
                    dVar.getClass();
                    Long l = dVar.f42534g;
                    if (l == null) {
                        return -1;
                    }
                    long jLongValue = l.longValue();
                    Long l7 = dVar2.f42534g;
                    if (l7 != null) {
                        return Intrinsics.compare(l7.longValue(), jLongValue);
                    }
                    return 1;
                } catch (Throwable th2) {
                    yx.a.a(wx.c.class, th2);
                    return 0;
                }
            case 16:
                vx.d dVar3 = (vx.d) obj;
                vx.d dVar4 = (vx.d) obj2;
                dVar4.getClass();
                dVar3.getClass();
                Long l11 = dVar3.f42534g;
                if (l11 == null) {
                    return -1;
                }
                long jLongValue2 = l11.longValue();
                Long l12 = dVar4.f42534g;
                if (l12 != null) {
                    return Intrinsics.compare(l12.longValue(), jLongValue2);
                }
                return 1;
            default:
                zx.a aVar = (zx.a) obj;
                zx.a aVar2 = (zx.a) obj2;
                aVar2.getClass();
                aVar.getClass();
                Long l13 = aVar.f48409c;
                if (l13 == null) {
                    return -1;
                }
                long jLongValue3 = l13.longValue();
                Long l14 = aVar2.f48409c;
                if (l14 != null) {
                    return Intrinsics.compare(l14.longValue(), jLongValue3);
                }
                return 1;
        }
    }
}
