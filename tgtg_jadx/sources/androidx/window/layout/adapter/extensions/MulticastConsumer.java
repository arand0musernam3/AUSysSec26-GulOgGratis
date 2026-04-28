package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import c1.q;
import cb.h;
import eb.g;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "Landroidx/core/util/Consumer;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "value", "", "accept", "(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMulticastConsumer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MulticastConsumer.kt\nandroidx/window/layout/adapter/extensions/MulticastConsumer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1863#2,2:59\n1#3:61\n*S KotlinDebug\n*F\n+ 1 MulticastConsumer.kt\nandroidx/window/layout/adapter/extensions/MulticastConsumer\n*L\n39#1:59,2\n*E\n"})
public final class MulticastConsumer implements Consumer<WindowLayoutInfo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4133a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f4135c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f4134b = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f4136d = new LinkedHashSet();

    public MulticastConsumer(Context context) {
        this.f4133a = context;
    }

    public final void a(q qVar) {
        ReentrantLock reentrantLock = this.f4134b;
        reentrantLock.lock();
        try {
            h hVar = this.f4135c;
            if (hVar != null) {
                qVar.accept(hVar);
            }
            this.f4136d.add(qVar);
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // androidx.core.util.Consumer
    public void accept(@NotNull WindowLayoutInfo value) {
        value.getClass();
        ReentrantLock reentrantLock = this.f4134b;
        reentrantLock.lock();
        try {
            h hVarB = g.b(this.f4133a, value);
            this.f4135c = hVarB;
            Iterator it = this.f4136d.iterator();
            while (it.hasNext()) {
                ((Consumer) it.next()).accept(hVarB);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
