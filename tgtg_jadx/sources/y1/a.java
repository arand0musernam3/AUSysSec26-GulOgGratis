package y1;

import b4.q;
import i80.n;
import i80.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements s {
    @Override // i80.s
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        int i11;
        String str = (String) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        c cVar = (c) obj4;
        n nVar = (n) obj5;
        Function0 function0 = (Function0) obj6;
        m3.n nVar2 = (m3.n) obj7;
        int iIntValue = ((Integer) obj8).intValue();
        int i12 = iIntValue & 6;
        q qVar = q.f5711a;
        if (i12 == 0) {
            i11 = (((m3.s) nVar2).f(qVar) ? 4 : 2) | iIntValue;
        } else {
            i11 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i11 |= ((m3.s) nVar2).f(str) ? 32 : 16;
        }
        if ((iIntValue & MLKEMEngine.KyberPolyBytes) == 0) {
            i11 |= ((m3.s) nVar2).g(zBooleanValue) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i11 |= ((m3.s) nVar2).f(cVar) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i11 |= ((m3.s) nVar2).h(nVar) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i11 |= ((m3.s) nVar2).h(function0) ? 131072 : 65536;
        }
        m3.s sVar = (m3.s) nVar2;
        if (sVar.R(i11 & 1, (599187 & i11) != 599186)) {
            g.c(str, zBooleanValue, cVar, qVar, nVar, function0, sVar, (i11 & 458752) | ((i11 >> 3) & 1022) | ((i11 << 9) & 7168) | (57344 & i11));
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }
}
