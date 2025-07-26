def split_melody(melody_str):
    result = []
    i = 0
    while i < len(melody_str):
        if i + 1 < len(melody_str) and melody_str[i + 1] == '#':
            result.append(melody_str[i] + '#')
            i += 2
        else:
            result.append(melody_str[i])
            i += 1
    return result


def to_minutes(time_str):
    h, m = map(int, time_str.split(":"))
    return h * 60 + m


def get_play_time(start, end):
    start_min = to_minutes(start)
    end_min = to_minutes(end)
    if end_min < start_min:
        end_min += 24 * 60
    return end_min - start_min


def solution(m, musicinfos):
    answer = None
    max_duration = -1
    m_arr = split_melody(m)

    for info in musicinfos:
        start_time, end_time, title, melody = info.split(',')
        duration = get_play_time(start_time, end_time)

        melody_arr = split_melody(melody)
        played_melody = (melody_arr * ((duration // len(melody_arr)) + 1))[:duration]

        for i in range(len(played_melody) - len(m_arr) + 1):
            if played_melody[i:i + len(m_arr)] == m_arr:
                if duration > max_duration:
                    max_duration = duration
                    answer = title
                break

    return answer if answer else "(None)"
