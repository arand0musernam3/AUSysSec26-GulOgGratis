package ed;

import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Lifecycle f15923j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ref.ObjectRef f15924k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15925m;

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f15925m |= Integer.MIN_VALUE;
        return f.a(null, this);
    }
}
