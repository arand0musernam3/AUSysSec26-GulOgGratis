package n2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import i80.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.n;
import m3.s;
import m5.t0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p2.g;
import r2.h;
import t2.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30282a;

    @Override // i80.p
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i11;
        int i12;
        switch (this.f30282a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                long j9 = ((t0) obj5).f29650a;
                String string = ((CharSequence) obj4).subSequence(t0.g(j9), t0.f(j9)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
            case 1:
                g gVar = (g) obj;
                d dVar = (d) obj2;
                Function0 function0 = (Function0) obj3;
                n nVar = (n) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                if ((iIntValue & 6) == 0) {
                    i11 = ((iIntValue & 8) == 0 ? ((s) nVar).f(gVar) : ((s) nVar).h(gVar) ? 4 : 2) | iIntValue;
                } else {
                    i11 = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i11 |= (iIntValue & 64) == 0 ? ((s) nVar).f(dVar) : ((s) nVar).h(dVar) ? 32 : 16;
                }
                if ((iIntValue & MLKEMEngine.KyberPolyBytes) == 0) {
                    i11 |= ((s) nVar).h(function0) ? 256 : 128;
                }
                s sVar = (s) nVar;
                if (sVar.R(i11 & 1, (i11 & 1171) != 1170)) {
                    h.c(gVar, dVar, function0, sVar, i11 & 1022);
                } else {
                    sVar.U();
                }
                break;
            default:
                g gVar2 = (g) obj;
                d dVar2 = (d) obj2;
                Function0 function02 = (Function0) obj3;
                n nVar2 = (n) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i12 = ((iIntValue2 & 8) == 0 ? ((s) nVar2).f(gVar2) : ((s) nVar2).h(gVar2) ? 4 : 2) | iIntValue2;
                } else {
                    i12 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i12 |= (iIntValue2 & 64) == 0 ? ((s) nVar2).f(dVar2) : ((s) nVar2).h(dVar2) ? 32 : 16;
                }
                if ((iIntValue2 & MLKEMEngine.KyberPolyBytes) == 0) {
                    i12 |= ((s) nVar2).h(function02) ? 256 : 128;
                }
                s sVar2 = (s) nVar2;
                if (sVar2.R(i12 & 1, (i12 & 1171) != 1170)) {
                    h.c(gVar2, dVar2, function02, sVar2, i12 & 1022);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
