package c5;

import android.os.Bundle;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends AccessibilityNodeProviderCompat {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h7.b f7105c;

    public /* synthetic */ a0(h7.b bVar, int i11) {
        this.f7104b = i11;
        this.f7105c = bVar;
    }

    @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
    public void a(int i11, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
        switch (this.f7104b) {
            case 0:
                ((f0) this.f7105c).a(i11, accessibilityNodeInfoCompat, str, bundle);
                break;
            default:
                super.a(i11, accessibilityNodeInfoCompat, str, bundle);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0ccb  */
    /* JADX WARN: Type inference failed for: r3v10, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.ArrayList] */
    @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat b(int r45) {
        /*
            Method dump skipped, instruction units count: 3318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.a0.b(int):androidx.core.view.accessibility.AccessibilityNodeInfoCompat");
    }

    @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
    public final AccessibilityNodeInfoCompat d(int i11) {
        switch (this.f7104b) {
            case 0:
                f0 f0Var = (f0) this.f7105c;
                if (i11 == 1) {
                    int i12 = f0Var.f7201j;
                    if (i12 != Integer.MIN_VALUE) {
                        return b(i12);
                    }
                } else {
                    if (i11 == 2) {
                        return b(f0Var.f7200i);
                    }
                    i4.a.f(j4.s.f(i11, "Unknown focus type: "));
                }
                return null;
            default:
                z7.a aVar = (z7.a) this.f7105c;
                int i13 = i11 == 2 ? aVar.f47314h : aVar.f47315i;
                if (i13 == Integer.MIN_VALUE) {
                    return null;
                }
                return b(i13);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:134:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x077d  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(int r22, int r23, android.os.Bundle r24) {
        /*
            Method dump skipped, instruction units count: 2184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.a0.f(int, int, android.os.Bundle):boolean");
    }
}
