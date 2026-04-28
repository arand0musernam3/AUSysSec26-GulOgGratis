package e7;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f15821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15823e;

    public /* synthetic */ e(Context context, String str, int i11, int i12, Object obj) {
        this.f15819a = i12;
        this.f15820b = str;
        this.f15821c = context;
        this.f15823e = obj;
        this.f15822d = i11;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f15819a) {
            case 0:
                Object[] objArr = {(d) this.f15823e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return g.b(this.f15820b, this.f15821c, Collections.unmodifiableList(arrayList), this.f15822d);
            default:
                try {
                    return g.b(this.f15820b, this.f15821c, (ArrayList) this.f15823e, this.f15822d);
                } catch (Throwable unused) {
                    return new f(-3);
                }
        }
    }
}
