package org.isomorphism.backend.tm;

public class TransactionManagerImpl implements TransactionManager {

    // XID文件头长度
    static final int LEN_XID_HEADER_LENGTH = 8;

    // 每个事务的占用长度
    private static final int XID_FIELD_SIZE = 1;

    // 事务的三种状态
    private static final byte FIELD_TRAN_ACTIVE   = 0;
    private static final byte FIELD_TRAN_COMMITTED = 1;
    private static final byte FIELD_TRAN_ABORTED  = 2;

    // 超级事务，永远为commited状态
    public static final long SUPER_XID = 0;

    // XID 文件后缀
    static final String XID_SUFFIX = ".xid";

    @Override
    public long begin() {
        return 0;
    }

    @Override
    public void commit(long xid) {

    }

    @Override
    public void abort(long xid) {

    }

    @Override
    public boolean isActive(long xid) {
        return false;
    }

    @Override
    public boolean isCommitted(long xid) {
        return false;
    }

    @Override
    public boolean isAborted(long xid) {
        return false;
    }

    @Override
    public void close() {

    }
}
