package com.adyen.checkout.googlepay.internal.util;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.o;
import u70.q;
import v80.k;
import v80.l;
import x70.c;
import y70.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "Lcom/google/android/gms/tasks/Task;", "Ld10/a;", "cancellationTokenSource", "awaitTask", "(Lcom/google/android/gms/tasks/Task;Ld10/a;Lx70/c;)Ljava/lang/Object;", "googlepay_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTaskExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskExtensions.kt\ncom/adyen/checkout/googlepay/internal/util/TaskExtensionsKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,40:1\n351#2,11:41\n*S KotlinDebug\n*F\n+ 1 TaskExtensions.kt\ncom/adyen/checkout/googlepay/internal/util/TaskExtensionsKt\n*L\n21#1:41,11\n*E\n"})
public final class TaskExtensionsKt {
    @Nullable
    public static final <T> Object awaitTask(@NotNull Task<T> task, @Nullable final d10.a aVar, @NotNull c<? super Task<T>> cVar) {
        if (task.m()) {
            return task;
        }
        final l lVar = new l(1, f.b(cVar));
        lVar.t();
        task.c(new DirectExecutor(), new OnCompleteListener() { // from class: com.adyen.checkout.googlepay.internal.util.TaskExtensionsKt$awaitTask$2$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(@NotNull Task<T> task2) {
                task2.getClass();
                k kVar = lVar;
                o oVar = q.f40850b;
                kVar.resumeWith(task2);
            }
        });
        if (aVar != null) {
            lVar.v(new Function1<Throwable, Unit>() { // from class: com.adyen.checkout.googlepay.internal.util.TaskExtensionsKt$awaitTask$2$2$1
                {
                    super(1);
                }

                public final void invoke(@Nullable Throwable th2) {
                    ((d10.o) aVar.f13696a.f39010b).q(null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.f26487a;
                }
            });
        }
        Object objS = lVar.s();
        y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
        return objS;
    }

    public static /* synthetic */ Object awaitTask$default(Task task, d10.a aVar, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = null;
        }
        return awaitTask(task, aVar, cVar);
    }
}
