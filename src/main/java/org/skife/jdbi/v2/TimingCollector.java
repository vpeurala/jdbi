package org.skife.jdbi.v2;

public interface TimingCollector
{
    void collect(String sql, StatementContext ctx, long elapsedTime);

    TimingCollector NOP_TIMING_COLLECTOR = new TimingCollector() {
        public void collect(final String sql, final StatementContext ctx, final long elapsedTime)
        {
            // GNDN
        }
    };
}
