package fi;

import android.net.Uri;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import z3.r;
import z4.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f17746b;

    public /* synthetic */ b(r rVar, int i11) {
        this.f17745a = i11;
        this.f17746b = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17745a) {
            case 0:
                z zVar = (z) obj;
                zVar.getClass();
                this.f17746b.add(Float.valueOf(Float.intBitsToFloat((int) (zVar.e(0L) >> 32))));
                break;
            default:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    r rVar = this.f17746b;
                    Iterator it = rVar.iterator();
                    int i11 = 0;
                    while (true) {
                        v70.b bVar = (v70.b) it;
                        if (!bVar.hasNext()) {
                            i11 = -1;
                        } else if (((Uri) bVar.next()) != null) {
                            i11++;
                        }
                    }
                    if (i11 != -1) {
                        rVar.set(i11, uri);
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
