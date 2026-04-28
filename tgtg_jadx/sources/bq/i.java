package bq;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.r2;
import c6.y;
import com.app.tgtg.model.remote.item.StoreInformation;
import i80.o;
import j4.s;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends l1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f6596f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f6597g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f6598h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f6599i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f6600j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f6601k = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6602a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Serializable f6604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Serializable f6605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f6606e;

    public i(StoreInformation storeInformation, y yVar, zp.b bVar) {
        storeInformation.getClass();
        this.f6603b = storeInformation;
        this.f6604c = yVar;
        this.f6605d = bVar;
        this.f6606e = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.l1
    public final int getItemCount() {
        switch (this.f6602a) {
            case 0:
                return ((List) this.f6603b).size();
            default:
                return ((ArrayList) this.f6606e).size();
        }
    }

    @Override // androidx.recyclerview.widget.l1
    public int getItemViewType(int i11) {
        switch (this.f6602a) {
            case 1:
                g gVar = (g) ((ArrayList) this.f6606e).get(i11);
                if (gVar instanceof a) {
                    f6596f = i11;
                } else {
                    if (gVar instanceof f) {
                        f6597g = i11;
                        return 1;
                    }
                    if (gVar instanceof j) {
                        f6599i = i11;
                        return 3;
                    }
                    if (gVar instanceof c) {
                        f6600j = i11;
                        return 4;
                    }
                    if (gVar instanceof b) {
                        f6601k = i11;
                        return 5;
                    }
                    if (gVar instanceof d) {
                        f6598h = i11;
                        return 2;
                    }
                    i4.a.f(s.f(i11, "Invalid position "));
                }
                return 0;
            default:
                return super.getItemViewType(i11);
        }
    }

    @Override // androidx.recyclerview.widget.l1
    public final void onBindViewHolder(r2 r2Var, int i11) {
        switch (this.f6602a) {
            case 0:
                h hVar = (h) r2Var;
                hVar.getClass();
                k kVar = hVar.f6594a;
                List list = (List) this.f6603b;
                kVar.setItem((mq.a) list.get(i11));
                if (list.size() % 2 != 0) {
                    kVar.setItemWidth(i11 == list.size() - 1);
                } else {
                    kVar.setItemWidth(i11 == list.size() - 1 || i11 == list.size() + (-2));
                }
                break;
            default:
                zp.e eVar = (zp.e) r2Var;
                eVar.getClass();
                eVar.f48020a.a((StoreInformation) this.f6603b, (y) this.f6604c, (zp.b) this.f6605d);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.l1
    public final r2 onCreateViewHolder(ViewGroup viewGroup, int i11) {
        g gVar;
        switch (this.f6602a) {
            case 0:
                viewGroup.getClass();
                Context context = viewGroup.getContext();
                context.getClass();
                return new h(this, new k(context, null, 6, 0));
            default:
                ArrayList arrayList = (ArrayList) this.f6606e;
                viewGroup.getClass();
                if (i11 == 0) {
                    gVar = (g) arrayList.get(f6596f);
                } else if (i11 == 1) {
                    gVar = (g) arrayList.get(f6597g);
                } else if (i11 == 2) {
                    gVar = (g) arrayList.get(f6598h);
                } else if (i11 == 3) {
                    gVar = (g) arrayList.get(f6599i);
                } else if (i11 == 4) {
                    gVar = (g) arrayList.get(f6600j);
                } else {
                    if (i11 != 5) {
                        i4.a.f(s.f(i11, "Unknown view type "));
                        return null;
                    }
                    gVar = (g) arrayList.get(f6601k);
                }
                gVar.getClass();
                return new zp.e(gVar);
        }
    }

    public i(ArrayList arrayList, String str, String str2, o oVar) {
        arrayList.getClass();
        oVar.getClass();
        this.f6603b = arrayList;
        this.f6604c = str;
        this.f6605d = str2;
        this.f6606e = oVar;
    }
}
