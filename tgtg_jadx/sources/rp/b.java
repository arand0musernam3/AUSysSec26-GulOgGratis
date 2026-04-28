package rp;

import com.braze.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pp.l;
import qp.f;
import qp.i;
import ra0.o;
import x70.c;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\n\u0010\u0004J\u001a\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lrp/b;", "", "Lqp/i;", Constants.BRAZE_PUSH_CONTENT_KEY, "(Lx70/c;)Ljava/lang/Object;", "Lpp/i;", Bayeux.KEY_DATA, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "(Lpp/i;Lx70/c;)Ljava/lang/Object;", "Lqp/c;", "e", "Lpp/l;", "b", "(Lpp/l;Lx70/c;)Ljava/lang/Object;", "Lpp/c;", "request", "Lqp/f;", "c", "(Lpp/c;Lx70/c;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @o("api/user/public-transport/v1/pinned-places/fetch")
    @Nullable
    Object a(@NotNull c<? super i> cVar);

    @o("api/user/public-transport/v1/stations")
    @Nullable
    Object b(@NotNull @ra0.a l lVar, @NotNull c<? super i> cVar);

    @o("api/user/public-transport/v1/search")
    @Nullable
    Object c(@NotNull @ra0.a pp.c cVar, @NotNull c<? super f> cVar2);

    @o("api/user/public-transport/v1/pinned-places")
    @Nullable
    Object d(@NotNull @ra0.a pp.i iVar, @NotNull c<? super i> cVar);

    @o("api/user/public-transport/v1/lines")
    @Nullable
    Object e(@NotNull c<? super qp.c> cVar);
}
