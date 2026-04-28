package com.app.tgtg.model.remote.user.response;

import com.app.tgtg.model.remote.serializer.EnumWithUnknownSerializer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/EmailAuthenticateStateSerializer;", "Lcom/app/tgtg/model/remote/serializer/EnumWithUnknownSerializer;", "Lcom/app/tgtg/model/remote/user/response/EmailAuthenticateState;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EmailAuthenticateStateSerializer extends EnumWithUnknownSerializer<EmailAuthenticateState> {

    @NotNull
    public static final EmailAuthenticateStateSerializer INSTANCE = new EmailAuthenticateStateSerializer();
    public static final int $stable = 8;

    private EmailAuthenticateStateSerializer() {
        super(EmailAuthenticateState.getEntries(), EmailAuthenticateState.UNKNOWN);
    }
}
