package fd;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f17557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f17558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f17559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f17560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u70.t f17561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u70.t f17562g;

    public e(List list, List list2, List list3, List list4, List list5) {
        this.f17556a = list;
        this.f17557b = list2;
        this.f17558c = list3;
        this.f17559d = list4;
        this.f17560e = list5;
        final int i11 = 0;
        this.f17561f = u70.l.b(new Function0(this) { // from class: fd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f17548b;

            {
                this.f17548b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        e eVar = this.f17548b;
                        List list6 = eVar.f17559d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            i0.s((List) ((Function0) list6.get(i12)).invoke(), arrayList);
                        }
                        eVar.f17559d = n0.f26529a;
                        return arrayList;
                    default:
                        e eVar2 = this.f17548b;
                        List list7 = eVar2.f17560e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i13 = 0; i13 < size2; i13++) {
                            i0.s((List) ((Function0) list7.get(i13)).invoke(), arrayList2);
                        }
                        eVar2.f17560e = n0.f26529a;
                        return arrayList2;
                }
            }
        });
        final int i12 = 1;
        this.f17562g = u70.l.b(new Function0(this) { // from class: fd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f17548b;

            {
                this.f17548b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        e eVar = this.f17548b;
                        List list6 = eVar.f17559d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i122 = 0; i122 < size; i122++) {
                            i0.s((List) ((Function0) list6.get(i122)).invoke(), arrayList);
                        }
                        eVar.f17559d = n0.f26529a;
                        return arrayList;
                    default:
                        e eVar2 = this.f17548b;
                        List list7 = eVar2.f17560e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i13 = 0; i13 < size2; i13++) {
                            i0.s((List) ((Function0) list7.get(i13)).invoke(), arrayList2);
                        }
                        eVar2.f17560e = n0.f26529a;
                        return arrayList2;
                }
            }
        });
    }
}
