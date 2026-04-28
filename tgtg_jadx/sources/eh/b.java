package eh;

import com.braze.Constants;
import fh.c;
import gh.i;
import gh.l;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ra0.o;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Leh/b;", "", "Lgh/l;", "b", "(Lx70/c;)Ljava/lang/Object;", "Lfh/c;", Bayeux.KEY_DATA, "Lgh/i;", Constants.BRAZE_PUSH_CONTENT_KEY, "(Lfh/c;Lx70/c;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @o("api/user/badge/getBadge")
    @Nullable
    Object a(@NotNull @ra0.a c cVar, @NotNull x70.c<? super i> cVar2);

    @o("api/user/badge")
    @Nullable
    Object b(@NotNull x70.c<? super l> cVar);
}
